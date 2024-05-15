/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class Ficheros {

    public static List<Paciente> leerFichero(String ruta) throws IOException {
        List<Paciente> lista = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        lista = mapeador.readValue(new File(ruta),
                mapeador.getTypeFactory().constructCollectionType(List.class,
                        Paciente.class));
        return lista;
    }
}
