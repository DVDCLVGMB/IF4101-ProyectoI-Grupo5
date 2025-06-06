package com.bulkgym.domain;

import java.util.List;

public class Ejercicio {
    // Atributos
    private int idEjercicio;
    private String nombreEjercicio;
    private String imagen;
    private List<CategoriaEjercicio> categoriaEjercicio;

    // Constructor vacío
    public Ejercicio() {}

    // Constructor completo
    public Ejercicio(int idEjercicio, String nombreEjercicio, String imagen, List<CategoriaEjercicio> categoriaEjercicio) {
        this.idEjercicio = idEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.imagen = imagen;
        this.categoriaEjercicio = categoriaEjercicio;
    }

    // Getters y Setters
    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<CategoriaEjercicio> getCategoriaEjercicio() {
        return categoriaEjercicio;
    }

    public void setCategoriaEjercicio(List<CategoriaEjercicio> categoriaEjercicio) {
        this.categoriaEjercicio = categoriaEjercicio;
    }

    
}
