package com.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/parse")
    public String parseInput(@RequestBody String input) {
        // Crear un CharStream a partir de la entrada
        CharStream charStream = CharStreams.fromString(input);

        // Crear el lexer usando ANTLR
        EstudiantesLexer lexer = new EstudiantesLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el parser usando los tokens generados
        EstudiantesParser parser = new EstudiantesParser(tokens);

        // Parsear la entrada usando una de las reglas definidas en la gramática
        EstudiantesParser.ComandoContext tree = parser.comando();

        // Aquí puedes agregar lógica para procesar el árbol de sintaxis (tree)
        // o simplemente retornar un mensaje de éxito
        return "Parseado exitosamente: " + tree.toStringTree(parser);
    }
}
