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

public class PacotePremiumFactory extends PacoteLocacaoFactory {
    @Override public Seguro criarSeguro() { return () -> "Total (Cobertura Completa)"; }
    @Override public Assistencia criarAssistencia() { return () -> "Assistência 24h VIP (Guincho)"; }
}
