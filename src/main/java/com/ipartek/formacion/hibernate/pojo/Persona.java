package com.ipartek.formacion.hibernate.pojo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Persona")
public class Persona {

	@Id
	@GeneratedValue
	Long id;

	/* Persistente, un tipo basico (string) */
	@Basic
	@Column(name = "nombre")
	private String nombre;

	/*
	 * Las fechas son m�s complejas, ya que no hay forma de saber a priori si un
	 * Date de java es un TIME, DATE o TIMESTAMP de base de datos (s�lo hora,
	 * s�lo fecha o fecha y hora). Por ello, debemos poner la
	 * annotation @Temporal, indicando detr�s qu� tipo de campo deseamos en base
	 * de datos.
	 * 
	 */

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento
	 *            the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

}
