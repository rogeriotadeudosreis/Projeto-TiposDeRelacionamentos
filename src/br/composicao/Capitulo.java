/*
 * Um livro é composto de capítulos
 * Um capítulo é parte essencial de um livro
 * Se não existir capítulo não existe livro: o objeto composto não existe sem
 * seus componentes
 * Capítulo não existe fora do livro.
 */

package br.composicao;

/**
 *
 * @author roger
 */
public class Capitulo {
    private int numero;
    private String descricao;

    public Capitulo(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }
    
    
}
