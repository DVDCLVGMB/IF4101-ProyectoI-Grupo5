package com.bulkgym.domain;

import java.sql.Date;

public class Rutina {
	private int idRutina,
				idCliente,
				idInstructor;
	private Date fechaCreacion,
					  fechaRenovacion;
	private String horario,
			       objetivo,
			       lesiones,
			       padecimientos;
	
	
	
	public Rutina() {
		super();
	}

	public Rutina(int idRutina, int idCliente, int idInstructor, Date fechaCreacion, Date fechaRenovacion,
			String horario, String objetivo, String lesiones, String padecimientos) {
		super();
		this.idRutina = idRutina;
		this.idCliente = idCliente;
		this.idInstructor = idInstructor;
		this.fechaCreacion = fechaCreacion;
		this.fechaRenovacion = fechaRenovacion;
		this.horario = horario;
		this.objetivo = objetivo;
		this.lesiones = lesiones;
		this.padecimientos = padecimientos;
	}
	
	public int getIdRutina() {
		return idRutina;
	}
	public void setIdRutina(int idRutina) {
		this.idRutina = idRutina;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaRenovacion() {
		return fechaRenovacion;
	}
	public void setFechaRenovacion(Date fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getLesiones() {
		return lesiones;
	}
	public void setLesiones(String lesiones) {
		this.lesiones = lesiones;
	}
	public String getPadecimientos() {
		return padecimientos;
	}
	public void setPadecimientos(String padecimientos) {
		this.padecimientos = padecimientos;
	}
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdInstructor() { 
    	return idInstructor; 
    }
    public void setIdInstructor(int idInstructor) { 
    	this.idInstructor = idInstructor; 
    }
	// End of getters-setters.
}// End of class [Rutina].
