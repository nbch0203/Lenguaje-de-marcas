package ns;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MiConfiguracion {
	
	@Bean
	public List<Alumno> get_alumnos(){
		List<Alumno> alumnos =new ArrayList<E>();
		Alumno a1 =new Alumno(1,"Ana","Marcas",5.6);
		alumnos.add(a1);
		Alumno a2 =new Alumno(2,"Pablo","Marcas",7.5);
		alumnos.add(a2);
		Alumno a3 =new Alumno(3,"Antonio","Marcas",2.6);
		alumnos.add(a3);
		Alumno a4 =new Alumno(4,"Felipe","Marcas",9.5);
		alumnos.add(a4);
		Alumno a5 =new Alumno(5,"Sara","Marcas",10.0);
		alumnos.add(a5);
		return alumnos;
	}
}
