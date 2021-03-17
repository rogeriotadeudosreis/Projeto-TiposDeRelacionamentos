/*
 * Composição
 * Um objeto contém uma lista de outros objetos.
 * Um objeto pode ser formado por outros objetos.
 * Um objeto é parte essencial de outro.
 * Os objetos contidos não fazem sentido fora do contexto do objeto que os contém.
 *   - Existe uma classe representando o "todo" e outras classes que funcionam como partes.
 *   - Quando o objeto "todo" deixa de existir os objetos partes deverão deixar
 *     de existir também.
 * 
 */

package br.composicao;

import br.associacao.Cliente;

/**
 *
 * @author roger
 */
public class ContaCorrente {
    private int agencia;
    private int numero;
    private Cliente cliente;
    
    
}
