/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;




public class Libro {
    private int idlibro;
    private String nombre;
    private String autor;
    private int año;
    private String edicion;
    private String publicacion; 
    
    public Libro(){
    }

    public Libro(int idlibro, String nombre, String autor, int año, String edicion, String publicacion) {
        this.idlibro = idlibro;
        this.nombre = nombre;
        this.autor = autor;
        this.año = año;
        this.edicion = edicion;
        this.publicacion = publicacion;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }
    
    
}
