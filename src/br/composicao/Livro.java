/*
 * Um livro é composto de capítulos
 * Um capítulo é parte essencial de um livro
 * Se não existir capítulo não existe livro: o objeto composto não existe sem
 * seus componentes
 * Capítulo não existe fora do livro.
 */

package br.composicao;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roger
 */
public class Livro {
    private int codIsbn;
    private String titulo;
    private String editora;
    private List<Capitulo> capitulos;

    public Livro(int codIsbn, String titulo, String editora, List<Capitulo> capitulos) {
        this.codIsbn = codIsbn;
        this.titulo = titulo;
        this.editora = editora;
        this.capitulos = new LinkedList<Capitulo>();
    }
    
   
    
}
