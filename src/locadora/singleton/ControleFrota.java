/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.singleton;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafaela
 */
public class ControleFrota {
    private static ControleFrota instancia;
    private Map<String, Integer> frota = new HashMap<>();

    private ControleFrota() {
        frota.put("Carro", 5);
        frota.put("Moto", 3);
        frota.put("Caminhao", 2);
        frota.put("Van", 1);
    }

    public static ControleFrota getInstancia() {
        if (instancia == null) {
            instancia = new ControleFrota();
        }
        return instancia;
    }

    public boolean disponivel(String tipo) {
        return frota.getOrDefault(tipo, 0) > 0;
    }

    public void reservar(String tipo) {
        if (disponivel(tipo)) {
            frota.put(tipo, frota.get(tipo) - 1);
        }
    }

    public String relatorioEstoque() {
        return "Carros: " + frota.get("Carro") + "\n" +
               "Motos: " + frota.get("Moto") + "\n" +
               "Caminhões: " + frota.get("Caminhao") + "\n" +
               "Vans: " + frota.get("Van");
    }
}