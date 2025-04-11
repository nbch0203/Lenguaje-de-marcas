package com.example.rest_peliculas.configuracion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.rest_peliculas.util.Pelicula;

@Configuration
public class MiConfiguracion {
	
	@Bean
	public List<Pelicula> get_peliculas() {
		
		List<Pelicula> peliculas = new ArrayList<>();
		
		Pelicula p1 = new Pelicula(1, "Star Wars", "Sci-Fi", "George Lucas", 1977);
		peliculas.add(p1);
		Pelicula p2 = new Pelicula(2, "La Naranja Mecánica", "Drama", "Anthony Burgess", 1975);
		peliculas.add(p2);
		Pelicula p3 = new Pelicula(3, "El Resplandor", "Terror", "Stephen King", 1980);
		peliculas.add(p3);
		Pelicula p4 = new Pelicula(4, "Braveheart", "Acción", "Mel Gibson", 1995);
		peliculas.add(p4);
		Pelicula p5 = new Pelicula(5, "Gladiator", "Historia", "Ridley Scott", 2000);
		peliculas.add(p5);
		
		return peliculas;
	}
	
	@Bean
	public HashMap<Integer, Pelicula> get_peliculas_hash() {
		
		HashMap<Integer, Pelicula> peliculas = new HashMap<Integer, Pelicula>();
		
		Pelicula p1 = new Pelicula(1, "Star Wars", "Sci-Fi", "George Lucas", 1977);
		peliculas.put(1, p1);
		Pelicula p2 = new Pelicula(2, "La Naranja Mecánica", "Drama", "Anthony Burgess", 1975);
		peliculas.put(2, p2);
		Pelicula p3 = new Pelicula(3, "El Resplandor", "Terror", "Stephen King", 1980);
		peliculas.put(3, p3);
		Pelicula p4 = new Pelicula(4, "Braveheart", "Acción", "Mel Gibson", 1995);
		peliculas.put(4, p4);
		Pelicula p5 = new Pelicula(5, "Gladiator", "Historia", "Ridley Scott", 2000);
		peliculas.put(5, p5);
		
		return peliculas;
	}

}