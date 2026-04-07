/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.factory;
import locadora.model.*;

/**
 *
 * @author Rafaela
 */

public abstract class PacoteLocacaoFactory {
    public abstract Seguro criarSeguro();
    public abstract Assistencia criarAssistencia();

    // Template Method para montar o pacote
    public PacoteLocacao montarPacote(VeiculoFactory fabricaVeiculo, String modelo) {
        Veiculo v = fabricaVeiculo.criarVeiculo(modelo);
        Seguro s = criarSeguro();
        Assistencia a = criarAssistencia();
        return new PacoteLocacao(v, s, a);
    }
}