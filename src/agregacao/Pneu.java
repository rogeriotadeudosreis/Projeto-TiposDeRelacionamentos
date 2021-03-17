/*
 * Se difere da composição porque não implica propriedade de um objeto em 
 * relação a outro
 * Um objeto contém uma lista de outros objetos
 * - os objetos contidos podem existir sem serem parte do objeto que os contém
 * - as classes utilizadas participam da classe principal
 * - a classe principal não contém estas classes utilizadas como sendo partes suas
 * Tipo de relação que um objeto agrega valor ao outro objeto relacionado
 * O objeto pode apenas conter uma referência para um objeto, mas não tem
 * controle do tempo de vida do objeto contido. 
 * Exemplo: um carro possui motor, pneu, porta.
 * Retirando as portas de um carro, o mesmo continua sendo um carro.
 * Motor e pneu existem como objetos independentes
 */

package agregacao;

/**
 *
 * @author roger
 */
public class Pneu {
    private int raio;
    private String modelo;
    private String marca;

    public Pneu(int raio, String modelo, String marca) {
        this.raio = raio;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    
}
