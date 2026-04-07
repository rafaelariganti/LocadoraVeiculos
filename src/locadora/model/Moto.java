/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

/**
 *
 * @author Rafaela
 */

public class Moto implements Veiculo {
    private String modelo;
    public Moto(String modelo) { this.modelo = modelo; }
    @Override public String getDescricao() { return "Moto: " + modelo; }
}