/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edu
 */
public class TablaPacientes extends DefaultTableModel {

    public TablaPacientes() {
        String[] nombreClmn = {"Id", "Nombre", "FecNacimiento", "GrupoSanguineo",
            "RH", "NumDonaciones"};
        this.setColumnIdentifiers(nombreClmn);
    }

    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
