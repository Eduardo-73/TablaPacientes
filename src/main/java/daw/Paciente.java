/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author edu
 */
public class Paciente {

    private int id_paciente;
    private String nombre;
    private String fechaNacimiento;
    private String grupoSanguineo;
    private String rh;
    private int numeroDonaciones;

    public Paciente() {
    }
    
    public Paciente(int id_paciente, String nombre, String fechaNacimiento,
            String grupoSanguineo, String rh, int numeroDonaciones) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.grupoSanguineo = grupoSanguineo;
        this.rh = rh;
        this.numeroDonaciones = numeroDonaciones;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public int getNumeroDonaciones() {
        return numeroDonaciones;
    }

    public void setNumeroDonaciones(int numeroDonaciones) {
        this.numeroDonaciones = numeroDonaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id = ").append(id_paciente);
        sb.append(", Nombre = ").append(nombre);
        sb.append(", Fecha de Nacimiento = ").append(fechaNacimiento);
        sb.append(", Grupo Sanguineo = ").append(grupoSanguineo);
        sb.append(", rh = ").append(rh);
        sb.append(", número de Donaciones = ").append(numeroDonaciones);
        return sb.toString();
    }

}
