# Estudiantes - Intérprete con LEX y YACC

Este proyecto es un intérprete desarrollado utilizando LEX y YACC para la gestión de estudiantes y sus calificaciones. Permite agregar estudiantes, gestionar sus calificaciones para tres parciales, modificar esas calificaciones, cambiar la ponderación de los parciales, y eliminar estudiantes.

## Características

- **Agregar estudiantes**: Se pueden agregar nuevos estudiantes proporcionando su nombre.
- **Asignar calificaciones**: Permite asignar calificaciones para los tres parciales de un estudiante.
- **Modificar calificaciones**: Se pueden modificar las calificaciones asignadas previamente.
- **Ponderación personalizada**: Se puede ajustar la ponderación de los tres parciales.
- **Eliminar estudiantes**: Permite eliminar un estudiante existente con confirmación.
- **Búsqueda de estudiantes**: Buscar un estudiante por nombre y mostrar sus calificaciones.
- **Listar estudiantes**: Listar todos los estudiantes y sus respectivas calificaciones con el promedio ponderado.

## Dependencias

Este proyecto requiere:

- **Lex y Yacc**: Para la generación del intérprete a partir de las reglas léxicas y sintácticas.
- **GCC**: Compilador de C para compilar los archivos generados por Lex y Yacc.

## Archivos Principales

- **lexer.l**: Define las reglas léxicas del lenguaje, describe los tokens como `estudiante`, `calificacion`, `modificar`, etc.
- **parser.y**: Define la gramática del lenguaje utilizando Yacc, con acciones para cada regla.
- **estudiantes.c**: Implementa la lógica del manejo de estudiantes, ponderación, y el flujo principal del programa.
  
## Uso

### Compilación

Para compilar el proyecto, sigue los siguientes pasos:

1. Abre una terminal (en Linux o Git Bash para Windows).
2. Navega al directorio del proyecto:

   ```bash
   cd /ruta/a/tu/proyecto
   
Ejecuta los siguientes comandos para compilar:
bison -d parser.y   # Genera parser.tab.c y parser.tab.h
flex lexer.l        # Genera lex.yy.c
gcc -o estudiantes parser.tab.c lex.yy.c estudiantes.c -lfl   # Compila todo el proyecto

Después de compilar, puedes ejecutar el intérprete:
./estudiantes

El programa te mostrará los comandos disponibles:
Comandos disponibles:
 * estudiante "Nombre del Estudiante"   -> Agregar un nuevo estudiante.
 * calificacion "Nombre" parcialX Nota  -> Agregar una calificación al parcial X (1, 2 o 3).
 * modificar "Nombre" parcialX Nota     -> Modificar una calificación existente de un parcial.
 * ponderacion                          -> Asignar un porcentaje personalizado a cada parcial.
 * eliminar "Nombre"                   -> Eliminar un estudiante (con confirmación).
 * buscar "Nombre"                     -> Buscar un estudiante y mostrar sus detalles.
 * listar                               -> Listar todos los estudiantes, sus calificaciones y porcentajes.
 * salir                                -> Salir del programa.


Ejemplo de uso>

> estudiante "Yannin"
Estudiante Yannin agregado.

> calificacion "Yannin" 1 85
Calificación 85 agregada al parcial 1 para Yannin.

> listar
Estudiante: Yannin
  Parcial 1: 85 (33.33%)
  Parcial 2: No asignado (33.33%)
  Parcial 3: No asignado (33.33%)
  Promedio acumulado: 28.33

> modificar "Yannin" 1 90
Calificación modificada a 90 para el parcial 1 de Yannin.

> ponderacion
Introduce el porcentaje para el parcial 1: 40
Introduce el porcentaje para el parcial 2: 30
Introduce el porcentaje para el parcial 3: 30
Porcentajes actualizados correctamente.

> eliminar "Yannin"
¿Está seguro de que desea eliminar al estudiante Yannin? (s/n): s
Estudiante Yannin eliminado.

> salir
Saliendo del programa...

.
├── lexer.l               # Reglas léxicas definidas en LEX
├── parser.y              # Gramática definida en YACC
├── estudiantes.c         # Lógica del programa
├── README.md             # Documentación del proyecto
├── parser.tab.c          # Generado por Bison (no incluido en el repositorio)
├── parser.tab.h          # Generado por Bison (no incluido en el repositorio)
├── lex.yy.c              # Generado por Flex (no incluido en el repositorio)
└── Makefile              # Opcional, para automatizar el proceso de compilación

Futuras Mejoras>
Persistencia de datos: Añadir funcionalidad para guardar los estudiantes y calificaciones en un archivo.
Interfaz gráfica: Implementar una interfaz gráfica para facilitar el uso del sistema.
Integración con Docker: Crear un contenedor Docker para ejecutar fácilmente el proyecto.


Licencia


### Cómo agregar el `README.md` a tu repositorio:

1. Asegúrate de que el archivo `README.md` esté en el directorio del proyecto.
2. Luego, sigue estos pasos en Git Bash para agregarlo al repositorio:

   ```bash
   git add README.md
   git commit -m "Añadir README.md con la documentación del proyecto"
   git push origin main



