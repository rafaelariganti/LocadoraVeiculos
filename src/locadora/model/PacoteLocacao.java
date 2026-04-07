/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

/**
 *
 * @author Rafaela
 */

public class PacoteLocacao {
    private Veiculo veiculo;
    private Seguro seguro;
    private Assistencia assistencia;

    public PacoteLocacao(Veiculo v, Seguro s, Assistencia a) {
        this.veiculo = v;
        this.seguro = s;
        this.assistencia = a;
    }

    @Override
    public String toString() {
        return "COMPROVANTE DE LOCAÇÃO\n" +
               "Veículo: " + veiculo.getDescricao() + "\n" +
               "Seguro: " + seguro.getDescricao() + "\n" +
               "Assistência: " + assistencia.getDescricao();
    }
}