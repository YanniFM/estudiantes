// Generated from com/example/Estudiantes.g4 by ANTLR 4.9.3
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EstudiantesParser}.
 */
public interface EstudiantesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EstudiantesParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(EstudiantesParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EstudiantesParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(EstudiantesParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EstudiantesParser#agregar_estudiante}.
	 * @param ctx the parse tree
	 */
	void enterAgregar_estudiante(EstudiantesParser.Agregar_estudianteContext ctx);
	/**
	 * Exit a parse tree produced by {@link EstudiantesParser#agregar_estudiante}.
	 * @param ctx the parse tree
	 */
	void exitAgregar_estudiante(EstudiantesParser.Agregar_estudianteContext ctx);
	/**
	 * Enter a parse tree produced by {@link EstudiantesParser#agregar_calificacion}.
	 * @param ctx the parse tree
	 */
	void enterAgregar_calificacion(EstudiantesParser.Agregar_calificacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EstudiantesParser#agregar_calificacion}.
	 * @param ctx the parse tree
	 */
	void exitAgregar_calificacion(EstudiantesParser.Agregar_calificacionContext ctx);
}