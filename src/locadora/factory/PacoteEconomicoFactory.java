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

public class PacoteEconomicoFactory extends PacoteLocacaoFactory {
    @Override public Seguro criarSeguro() { return () -> "Básico (Contra Terceiros)"; }
    @Override public Assistencia criarAssistencia() { return () -> "Sem Assistência 24h"; }
}