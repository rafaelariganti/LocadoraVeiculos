/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

/**
 *
 * @author Rafaela
 */
public class Carro implements Veiculo {
    private String modelo;
    public Carro(String modelo) { this.modelo = modelo; }
    @Override public String getDescricao() { return "Carro: " + modelo; }
}