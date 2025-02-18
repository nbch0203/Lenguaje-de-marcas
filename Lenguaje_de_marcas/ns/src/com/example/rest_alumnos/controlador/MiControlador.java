package com.example.rest_alumnos.controlador;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class MiControlador {
	
	@Autowired
	List<Alumno> alumnos;
	
	@Getmapping("/get_alumnos")
	public List<Alumno> get_alumnos(){
		return alumnos;
	}

}
