grammar Estudiantes;

// Lexer rules (tokens)
ADD: 'agregar';
ESTUDIANTE: 'estudiante';
CALIFICACION: 'calificacion';
PARCIAL: 'parcial';
NUMERO: [0-9]+;
NOMBRE: [a-zA-Z]+;
WS: [ \t\r\n]+ -> skip;

// Parser rules (comandos)
comando: agregar_estudiante | agregar_calificacion;

agregar_estudiante: ADD ESTUDIANTE NOMBRE;
agregar_calificacion: ADD CALIFICACION NOMBRE PARCIAL NUMERO;
