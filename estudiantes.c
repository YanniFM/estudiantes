#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_ESTUDIANTES 50  // Máximo de 50 estudiantes
#define NUM_PARCIALES 3     // 3 parciales

// Declaraciones de funciones
int yylex();
int yyparse();
void mostrar_comandos();

// Definición de estudiantes
typedef struct {
    char nombre[50];
    int parciales[NUM_PARCIALES];  // Arreglo para los 3 parciales
    int total_parciales;           // Para verificar cuántos parciales tiene ingresados
} Estudiante;

Estudiante estudiantes[MAX_ESTUDIANTES];
int total_estudiantes = 0;

// Pesos por defecto: cada parcial tiene un 33.33% (1/3)
float pesos[NUM_PARCIALES] = {0.3333, 0.3333, 0.3333};

// Función para mostrar los comandos disponibles
void mostrar_comandos() {
    printf("\nComandos disponibles:\n");
    printf(" * estudiante \"Nombre del Estudiante\"   -> Agregar un nuevo estudiante.\n");
    printf(" * calificacion \"Nombre\" parcialX Nota  -> Agregar una calificación al parcial X (1, 2 o 3).\n");
    printf(" * modificar \"Nombre\" parcialX Nota     -> Modificar una calificación existente de un parcial.\n");
    printf(" * ponderacion                           -> Asignar un porcentaje personalizado a cada parcial.\n");
    printf(" * eliminar \"Nombre\"                   -> Eliminar un estudiante (con confirmación).\n");
    printf(" * buscar \"Nombre\"                     -> Buscar un estudiante y mostrar sus detalles.\n");
    printf(" * listar                               -> Listar todos los estudiantes, sus calificaciones y porcentajes.\n");
    printf(" * salir                                -> Salir del programa.\n");
    printf("\nIntroduce un comando:\n");
}

// Función para agregar un estudiante
void agregar_estudiante(char* nombre) {
    for (int i = 0; i < total_estudiantes; i++) {
        if (strcmp(estudiantes[i].nombre, nombre) == 0) {
            printf("Error: El estudiante %s ya existe.\n", nombre);
            return;
        }
    }
    if (total_estudiantes >= MAX_ESTUDIANTES) {
        printf("No se pueden agregar más estudiantes.\n");
        return;
    }
    strcpy(estudiantes[total_estudiantes].nombre, nombre);
    estudiantes[total_estudiantes].total_parciales = 0;
    for (int j = 0; j < NUM_PARCIALES; j++) {
        estudiantes[total_estudiantes].parciales[j] = -1;  // Inicializar parciales como vacíos (-1)
    }
    total_estudiantes++;
    printf("Estudiante %s agregado.\n", nombre);
}

// Función para agregar calificaciones
void agregar_calificacion(char* nombre, int parcial, int calificacion) {
    if (calificacion < 0 || calificacion > 100) {
        printf("Error: Calificación no válida. Debe estar entre 0 y 100.\n");
        return;
    }
    for (int i = 0; i < total_estudiantes; i++) {
        if (strcmp(estudiantes[i].nombre, nombre) == 0) {
            if (parcial > 0 && parcial <= NUM_PARCIALES) {
                if (estudiantes[i].parciales[parcial - 1] != -1) {
                    printf("Error: El parcial %d ya tiene una calificación asignada.\n", parcial);
                    return;
                }
                estudiantes[i].parciales[parcial - 1] = calificacion;
                estudiantes[i].total_parciales++;
                printf("Calificación %d agregada al parcial %d para %s.\n", calificacion, parcial, nombre);
            } else {
                printf("Error: Número de parcial no válido. Ingrese un parcial entre 1 y %d.\n", NUM_PARCIALES);
            }
            return;
        }
    }
    printf("Error: Estudiante %s no encontrado.\n", nombre);
}

// Función para modificar la ponderación de los parciales
void ponderacion() {
    float nueva_ponderacion[NUM_PARCIALES];
    float suma = 0;

    // Pedir al usuario los nuevos valores de porcentaje para cada parcial
    do {
        suma = 0;
        for (int i = 0; i < NUM_PARCIALES; i++) {
            printf("Introduce el porcentaje para el parcial %d: ", i + 1);
            while (scanf("%f", &nueva_ponderacion[i]) != 1) {
                printf("Error: Introduce un número válido para el parcial %d: ", i + 1);
                while (getchar() != '\n');  // Limpiar el buffer en caso de entrada inválida
            }
            suma += nueva_ponderacion[i];
        }

        // Verificar si la suma es 100
        if (suma != 100) {
            printf("Error: La suma de los porcentajes debe ser exactamente 100. Inténtalo de nuevo.\n");
        }
    } while (suma != 100);

    // Actualizar los pesos
    for (int i = 0; i < NUM_PARCIALES; i++) {
        pesos[i] = nueva_ponderacion[i] / 100.0;  // Convertir a porcentaje decimal
    }
    printf("Porcentajes actualizados correctamente.\n");

    // Limpiar el buffer de entrada después de ejecutar correctamente
    while (getchar() != '\n');  // Limpiar el buffer en caso de saltos de línea pendientes
}


// Función para calcular el promedio acumulado considerando los pesos de cada parcial
float calcular_promedio_acumulado(Estudiante estudiante) {
    float suma = 0.0;
    for (int j = 0; j < NUM_PARCIALES; j++) {
        if (estudiante.parciales[j] != -1) {
            suma += estudiante.parciales[j] * pesos[j];
        } else {
            suma += 0 * pesos[j];
        }
    }
    return suma;
}

// Función para listar los estudiantes con su promedio acumulado y mostrar los porcentajes
void listar_estudiantes() {
    if (total_estudiantes == 0) {
        printf("No hay estudiantes registrados.\n");
        return;
    }
    for (int i = 0; i < total_estudiantes; i++) {
        printf("Estudiante: %s\n", estudiantes[i].nombre);
        for (int j = 0; j < NUM_PARCIALES; j++) {
            if (estudiantes[i].parciales[j] != -1) {
                printf("  Parcial %d: %d (%.2f%%)\n", j + 1, estudiantes[i].parciales[j], pesos[j] * 100);
            } else {
                printf("  Parcial %d: No asignado (%.2f%%)\n", j + 1, pesos[j] * 100);
            }
        }
        // Mostrar el promedio acumulado considerando los pesos de cada parcial
        float promedio_acumulado = calcular_promedio_acumulado(estudiantes[i]);
        printf("  Promedio acumulado: %.2f\n", promedio_acumulado);
    }
}

// Función para buscar a un estudiante por nombre
void buscar_estudiante(char* nombre) {
    for (int i = 0; i < total_estudiantes; i++) {
        if (strcmp(estudiantes[i].nombre, nombre) == 0) {
            printf("Estudiante encontrado: %s\n", estudiantes[i].nombre);
            for (int j = 0; j < NUM_PARCIALES; j++) {
                if (estudiantes[i].parciales[j] != -1) {
                    printf("  Parcial %d: %d (%.2f%%)\n", j + 1, estudiantes[i].parciales[j], pesos[j] * 100);
                } else {
                    printf("  Parcial %d: No asignado (%.2f%%)\n", j + 1, pesos[j] * 100);
                }
            }
            // Mostrar el promedio acumulado considerando los pesos de cada parcial
            float promedio_acumulado = calcular_promedio_acumulado(estudiantes[i]);
            printf("  Promedio acumulado: %.2f\n", promedio_acumulado);
            return;
        }
    }
    printf("Error: Estudiante %s no encontrado.\n", nombre);
}

// Función para modificar una calificación existente
void modificar_calificacion(char* nombre, int parcial, int calificacion) {
    if (calificacion < 0 || calificacion > 100) {
        printf("Error: Calificación no válida. Debe estar entre 0 y 100.\n");
        return;
    }
    for (int i = 0; i < total_estudiantes; i++) {
        if (strcmp(estudiantes[i].nombre, nombre) == 0) {
            if (parcial > 0 && parcial <= NUM_PARCIALES) {
                printf("Calificación anterior del parcial %d: %d\n", parcial, estudiantes[i].parciales[parcial - 1]);
                estudiantes[i].parciales[parcial - 1] = calificacion;
                printf("Calificación modificada a %d para el parcial %d de %s.\n", calificacion, parcial, nombre);
            } else {
                printf("Error: Número de parcial no válido.\n");
            }
            return;
        }
    }
    printf("Error: Estudiante %s no encontrado.\n", nombre);
}

// Función para eliminar un estudiante con confirmación
void eliminar_estudiante(char* nombre) {
    char confirmacion;
    for (int i = 0; i < total_estudiantes; i++) {
        if (strcmp(estudiantes[i].nombre, nombre) == 0) {
            printf("¿Está seguro de que desea eliminar al estudiante %s? (s/n): ", nombre);
            scanf(" %c", &confirmacion);
            while (getchar() != '\n');  // Limpiar el buffer de entrada

            if (confirmacion == 's' || confirmacion == 'S') {
                for (int j = i; j < total_estudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                total_estudiantes--;
                printf("Estudiante %s eliminado.\n", nombre);
            } else {
                printf("Operación cancelada. El estudiante %s no fue eliminado.\n", nombre);
            }
            return;
        }
    }
    printf("Error: Estudiante %s no encontrado.\n", nombre);
}

// Manejo del flujo principal
int main() {
    int resultado;
    mostrar_comandos();  // Mostrar comandos al comienzo solo una vez
    while (1) {
        resultado = yyparse();  // Ejecutar el parser
        if (resultado != 0) {
            printf("Introduce un comando válido:\n");  // Solicitar un nuevo comando en caso de error
        }
    }
    return 0;
}
