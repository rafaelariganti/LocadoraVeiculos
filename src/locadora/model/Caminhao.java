/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

/**
 *
 * @author Rafaela
 */

public class Caminhao implements Veiculo {
    private String modelo;
    public Caminhao(String modelo) { this.modelo = modelo; }
    @Override public String getDescricao() { return "Caminhão: " + modelo; }
}