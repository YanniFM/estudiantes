%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Declaraciones de funciones
int yylex();
int yyerror(const char *s);
void agregar_estudiante(char* nombre);
void agregar_calificacion(char* nombre, int parcial, int calificacion);
void modificar_calificacion(char* nombre, int parcial, int calificacion);
void eliminar_estudiante(char* nombre);
void listar_estudiantes();
void ponderacion();
void buscar_estudiante(char* nombre);
void salir();
%}

%union {
    char* str;
    int num;
}

%token ESTUDIANTE CALIFICACION ELIMINAR LISTAR SALIR PONDERACION BUSCAR MODIFICAR
%token <str> STRING
%token <num> NUMBER

%%

program:
    | program comando '\n'  // Aceptar un salto de línea después de un comando válido
    ;

comando:
    ESTUDIANTE STRING { agregar_estudiante($2); }
    | CALIFICACION STRING NUMBER NUMBER { agregar_calificacion($2, $3, $4); }
    | MODIFICAR STRING NUMBER NUMBER { modificar_calificacion($2, $3, $4); }
    | ELIMINAR STRING { eliminar_estudiante($2); }
    | LISTAR { listar_estudiantes(); }
    | PONDERACION { ponderacion(); }
    | BUSCAR STRING { buscar_estudiante($2); }
    | SALIR { salir(); }
    ;

%%

int yyerror(const char *s) {
    printf("Error: Comando inválido o mal formado. Introduce un comando válido.\n");
    // Consumir los tokens incorrectos hasta el salto de línea
    while (yylex() != '\n');
    return 0;
}

void salir() {
    printf("Saliendo del programa...\n");
    exit(0);
}
