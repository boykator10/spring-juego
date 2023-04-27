package com.videojuego.dao;

import org.springframework.data.repository.CrudRepository;

import com.videojuego.dominio.VideoJuego;

public interface JuegoDao extends CrudRepository<VideoJuego, Integer>{

}
