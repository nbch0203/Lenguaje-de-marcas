package com.example.rest_peliculas.controlador;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_peliculas.util.Pelicula;

@CrossOrigin
@RestController
@RequestMapping("/peliculas")
public class MiControlador {
	
	@Autowired
	List<Pelicula> peliculas;
	
	@Autowired
	HashMap<Integer, Pelicula> peliculas_hash;
	
	@GetMapping("/get_peliculas")
	public List<Pelicula> get_peliculas() {
		return peliculas;
	}
	
	@GetMapping("/get_peliculas_hash")
	public HashMap<Integer, Pelicula> get_peliculas_hash() {
		return peliculas_hash;
	}
	
	@PostMapping("/add_pelicula")
	public Integer add_pelicula(@RequestBody Pelicula pelicula) {
		int id_pelicula = pelicula.getId_pelicula();
		if (peliculas_hash.containsKey(id_pelicula)==true) {
		    return 1;
		}else {
			peliculas.add(pelicula);
			peliculas_hash.put(id_pelicula, pelicula);
		}
		return 0;
	}

}
