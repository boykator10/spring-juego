package com.videojuego.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIDEOJUEGO")
public class VideoJuego {
 
	@Id
	@Column (name = "ID_JUEGO", columnDefinition = "NUMBER")
	int idJuego;

	@Column (name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	String nombre;
	
	@Column (name = "GENERO", columnDefinition = "NVARCHAR2(100)")
	String genero;
	
	@Column (name = "PRECIO", columnDefinition = "NUMBER")
	double precio;
	
	@Column (name = "CLASIFICACION", columnDefinition = "NVARCHAR2(100)")
	String clasificacion;

	public VideoJuego() {
	}

	public VideoJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public VideoJuego(int idJuego, String nombre, String genero, double precio, String clasificacion) {
		this.idJuego = idJuego;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
		this.clasificacion = clasificacion;
	}

	public int getIdJuego() {
		return idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "VideoJuego [idJuego=" + idJuego + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio
				+ ", clasificacion=" + clasificacion + "]\n";
	}

}
