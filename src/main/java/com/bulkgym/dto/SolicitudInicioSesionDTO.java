package com.bulkgym.dto;

public class SolicitudInicioSesionDTO {

    private String usuario;
    private String contrasenia;

    public SolicitudInicioSesionDTO() {}

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
