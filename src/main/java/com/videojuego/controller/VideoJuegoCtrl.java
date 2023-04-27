package com.videojuego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.videojuego.dominio.VideoJuego;
import com.videojuego.servicios.JuegoServ;

@Controller
@RequestMapping("ctrl/Juego")
public class VideoJuegoCtrl {
	
	@Autowired
	JuegoServ juegoServ;
	
	// http://localhost:8090/ctrl/Juego/inicio
	@GetMapping("inicio")
	public String inicio (Model model) {
		var lista = juegoServ.listar();
		model.addAttribute("lista", lista);
		return "index";
	}
	
	// http://localhost:8090/ctrl/Juego/abrirGuardar
	@GetMapping("abrirGuardar")
	public String abrirGuardar(@ModelAttribute("juego")VideoJuego juego) {
		return "guardar";
	}
	
	// http://localhost:8090/ctrl/Juego/guardar
	@PostMapping("guardar")
	public String guardar(VideoJuego juego) {
		juegoServ.guardar(juego);
		return "redirect:/ctrl/Juego/inicio";
	}
	
	// http://localhost:8090/ctrl/Juego/abrirEditar
	@GetMapping("/abrirEditar/{idJuego}")
	public String abrirEditar(VideoJuego juego, Model model) {
		juego = juegoServ.buscar(juego);
		model.addAttribute("juego", juego);
		return "editar";
	}
	
	@PostMapping("editar")
	public String editar(VideoJuego juego) {
		juegoServ.editar(juego);
		return "redirect:/ctrl/Juego/inicio";
	}
	
	@GetMapping("/abrirEliminar/{idJuego}")
	public String abrirEliminar(VideoJuego juego, Model model) {
		juego = juegoServ.buscar(juego);
		model.addAttribute("juego", juego);
		return "eliminar";
	}
	
	@PostMapping("eliminar")
	public String eliminar(VideoJuego juego) {
		juegoServ.eliminar(juego); 
		return "redirect:/ctrl/Juego/inicio";
	}
	
	
	
	
	
	

}
