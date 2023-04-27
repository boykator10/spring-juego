package com.videojuego.servicios;

import java.util.List;

import com.videojuego.dominio.VideoJuego;

public interface JuegoServ {

	public void guardar(VideoJuego juego);

	public void editar(VideoJuego juego);

	public void eliminar(VideoJuego juego);

	public VideoJuego buscar(VideoJuego juego);

	public List<VideoJuego> listar();

}
