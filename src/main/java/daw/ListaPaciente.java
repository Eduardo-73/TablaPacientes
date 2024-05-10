/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class ListaPaciente {

    private List<Paciente> lista;

    public ListaPaciente() throws IOException {
        lista = new ArrayList<>();
        lista = Ficheros.leerFichero("donantes.json");
    }

    public List<Paciente> getLista() {
        return lista;
    }

    public Paciente getPersona(String id) {
        System.out.println("id buscado " + id);
        // Habría que controlar que si el id no es valido, hay excepción
        return lista.stream()
                .filter(p -> String.valueOf(p.getId_paciente()).equalsIgnoreCase(id))
                .findFirst()
                .get();
    }
}
