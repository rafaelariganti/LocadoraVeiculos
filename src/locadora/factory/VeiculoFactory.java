/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package locadora.factory;

import locadora.model.Veiculo;

/**
 *
 * @author Rafaela
 */

public interface VeiculoFactory {
    Veiculo criarVeiculo(String modelo);
}
