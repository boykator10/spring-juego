package com.videojuego.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videojuego.dao.JuegoDao;
import com.videojuego.dominio.VideoJuego;

@Service
public class JuegoImp implements JuegoServ{
	
	@Autowired
	JuegoDao juegoDao;

	@Override
	public void guardar(VideoJuego juego) {
		juegoDao.save(juego);
		
	}

	@Override
	public void editar(VideoJuego juego) {
		juegoDao.save(juego);
		
	}

	@Override
	public void eliminar(VideoJuego juego) {
		juegoDao.delete(juego);
		
	}

	@Override
	public VideoJuego buscar(VideoJuego juego) {
		return juegoDao.findById(juego.getIdJuego()).orElse(juego);
	}

	@Override
	public List<VideoJuego> listar() {
		return (List<VideoJuego>) juegoDao.findAll();
	}

}
