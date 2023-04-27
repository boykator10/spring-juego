package com.videojuego.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videojuego.dominio.VideoJuego;
import com.videojuego.servicios.JuegoServ;

@RestController //Convertimos una clase a un controlador RESTful.
@RequestMapping("api/Juego")//Es la peticion de un path
@CrossOrigin //Evitar errores de cross
public class VideoJuegoWs {
	
	@Autowired
	JuegoServ juegoServ;
	
	
	//  http://localhost:8090/api/Juego/listar 
	@GetMapping("listar")
	public List<VideoJuego> listar(){
		var lista = juegoServ.listar();
		return lista;
	}
	
	@PostMapping("buscar")
	public VideoJuego buscar(@RequestBody VideoJuego juego) {
		juego = juegoServ.buscar(juego);
		return juego;		
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody VideoJuego juego) {
		juegoServ.guardar(juego);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody VideoJuego juego) {
		juegoServ.editar(juego);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody VideoJuego juego) {
		juegoServ.eliminar(juego);
	}
	

}
