package com.Tarea3DWESOscar.modelo;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "mensajes")
public class Mensaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "fechahora")
	private Date fechahora;
	@Column(name = "mensaje")
	private String mensaje;

	@ManyToOne
	@JoinColumn(name = "idejemplar")
	private Ejemplar ejemplar;

	@ManyToOne
	@JoinColumn(name = "idpersona")
	private Persona persona;

	public Mensaje() {

	}

	

	public Mensaje(Long id, Date fechahora, String mensaje, Ejemplar ejemplar, Persona persona) {
		super();
		this.id = id;
		this.fechahora = fechahora;
		this.mensaje = mensaje;
		this.ejemplar = ejemplar;
		this.persona = persona;
	}

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getFechahora() {
		return fechahora;
	}



	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}



	public String getMensaje() {
		return mensaje;
	}



	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}



	public Ejemplar getEjemplar() {
		return ejemplar;
	}



	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(ejemplar, fechahora, id, mensaje, persona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return Objects.equals(ejemplar, other.ejemplar) && Objects.equals(fechahora, other.fechahora)
				&& Objects.equals(id, other.id) && Objects.equals(mensaje, other.mensaje)
				&& Objects.equals(persona, other.persona);
	}


	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", fechahora=" + fechahora + ", mensaje=" + mensaje + ", ejemplar=" + ejemplar
				+ ", persona=" + persona + "]";
	}

}