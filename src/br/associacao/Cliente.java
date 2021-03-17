/*
 * Associação
 * Mecanismo pelo qual um objeto utiliza os recursos de outro objeto.
 * Indica algum relacionamento significativo e de interesse entre objetos
 * Ocorre quando um objeto "usa" outros objetos
 * Define um relacionamento entre dois objetos de forma que um objeto faça 
 * com que o outro realize uma ação em seu lugar
 */

package br.associacao;

/**
 *
 * @author roger
 */
public class Cliente {
    private int cpf;
    private String nome;

    public Cliente(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
}
