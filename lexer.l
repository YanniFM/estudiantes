%{
#include "parser.tab.h"
%}

%%

"estudiante"      { return ESTUDIANTE; }
"calificacion"    { return CALIFICACION; }
"modificar"       { return MODIFICAR; }
"eliminar"        { return ELIMINAR; }
"listar"          { return LISTAR; }
"salir"           { return SALIR; }
"ponderacion"     { return PONDERACION; }
"buscar"          { return BUSCAR; }
[0-9]+            { yylval.num = atoi(yytext); return NUMBER; }
\"[^\"]+\"        { 
                     yylval.str = strdup(yytext + 1);  
                     yylval.str[strlen(yylval.str) - 1] = '\0';  
                     return STRING; 
                  }
[ \t]+            { /* ignorar espacios y tabs */ }
\n                { return '\n'; }  // Manejo correcto del salto de línea
.                 { return yytext[0]; }

%%

int yywrap() {
    return 1;
}
