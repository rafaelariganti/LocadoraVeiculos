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

public class VanFactory implements VeiculoFactory {
    @Override public Veiculo criarVeiculo(String modelo) { return new Van(modelo); }
}
