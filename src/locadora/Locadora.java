/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadora;

import locadora.factory.*;
import locadora.model.*;
import locadora.singleton.ControleFrota;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafaela
 */

public class Locadora {
    public static void main(String[] args) {
        ControleFrota frota = ControleFrota.getInstancia();

        while (true) {
            // 1. Menu Principal
            String[] menu = {"Alugar Veículo", "Ver Estoque", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Bem-vindo à Locadora!\nO que deseja fazer?", 
                    "Sistema de Locação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);

            if (escolha == 2 || escolha == -1) break;

            if (escolha == 1) { 
                // Mostra a frota atual
                JOptionPane.showMessageDialog(null, frota.relatorioEstoque(), "Estoque Disponível", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            // 2. Escolha do Veículo
            String[] tipos = {"Carro", "Moto", "Caminhao", "Van"};
            String tipoEscolhido = (String) JOptionPane.showInputDialog(null, "Selecione a categoria:", 
                    "Categoria", JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);

            if (tipoEscolhido == null) continue;

            // 3. Verificação no Singleton
            if (!frota.disponivel(tipoEscolhido)) {
                JOptionPane.showMessageDialog(null, "Desculpe, nenhum(a) " + tipoEscolhido + " disponível no estoque.", 
                        "Sem Estoque", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            // 4. Digitar o modelo
            String modelo = JOptionPane.showInputDialog("Digite o modelo desejado (ex: Civic, Gol, etc):");
            if (modelo == null || modelo.trim().isEmpty()) modelo = "Padrão";

            // 5. Escolha do Pacote
            String[] pacotes = {"Econômico", "Premium"};
            String pacoteEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha o pacote de benefícios:", 
                    "Pacote", JOptionPane.QUESTION_MESSAGE, null, pacotes, pacotes[0]);

            if (pacoteEscolhido == null) continue;

            // 6. Configuração das Fábricas (Factory Method)
            VeiculoFactory veiculoFactory;
            switch (tipoEscolhido) {
                case "Carro": veiculoFactory = new CarroFactory(); break;
                case "Moto": veiculoFactory = new MotoFactory(); break;
                case "Caminhao": veiculoFactory = new CaminhaoFactory(); break;
                default: veiculoFactory = new VanFactory(); break;
            }

            // 7. Configuração do Pacote (Abstract Factory)
            PacoteLocacaoFactory pacoteFactory;
            if (pacoteEscolhido.equals("Econômico")) {
                pacoteFactory = new PacoteEconomicoFactory();
            } else {
                pacoteFactory = new PacotePremiumFactory();
            }

            // 8. Criação Final e Reserva
            PacoteLocacao locacaoFinal = pacoteFactory.montarPacote(veiculoFactory, modelo);
            frota.reservar(tipoEscolhido);

            // 9. Comprovante na tela
            JOptionPane.showMessageDialog(null, locacaoFinal.toString(), "Reserva Confirmada com Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}