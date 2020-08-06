/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author joseph
 */
public class personal {
    private int idpersonal;
    private String npersonal;
    private String apersonal;
    private String DNI;
    private String estado;
    private int telefono;
    
    public personal(){    
    }

    public personal(int idpersonal, String npersonal, String apersonal, String DNI, String estado, int telefono) {
        this.idpersonal = idpersonal;
        this.npersonal = npersonal;
        this.apersonal = apersonal;
        this.DNI = DNI;
        this.estado = estado;
        this.telefono = telefono;
    }

    public int getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getNpersonal() {
        return npersonal;
    }

    public void setNpersonal(String npersonal) {
        this.npersonal = npersonal;
    }

    public String getApersonal() {
        return apersonal;
    }

    public void setApersonal(String apersonal) {
        this.apersonal = apersonal;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
