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
public class ContaCorrente {
    private int agencia;
    private int numero;
    private Cliente cliente;

    public ContaCorrente(int agencia, int numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }
    
    
}
