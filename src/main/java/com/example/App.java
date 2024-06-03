package com.example;

import com.example.Empleado.Dpt;
import com.example.Estudiante.Facultad;
import com.example.Persona.Genero;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	
    	Empleado[] empleados = {
    		Empleado.builder()
    		.nombre("Adrián")
    		.primerApellido("Santos")
    		.segundoApellido("Santos")
    		.genero(Genero.MASCULINO)
    		.departamento(Dpt.INFORMATICA)
    		.salario(2500)
    		.build(),
    		Empleado.builder()
    		.nombre("Ana")
    		.primerApellido("Celia")
    		.segundoApellido("de Armas")
    		.genero(Genero.FEMENINO)
    		.departamento(Dpt.RRHH)
    		.salario(3000)
    		.build()
    	};
    	
    	Estudiante[] estudiantes = {
    			Estudiante.builder()
    			.nombre("Hugo")
    			.primerApellido("Vila")
    			.genero(Genero.MASCULINO)
    			.facultad(Facultad.CIENCIAS)
    			.totalAsignaturas(10)
    			.build(),
    			Estudiante.builder()
    			.nombre("Robert")
    			.primerApellido("Niro")
    			.genero(Genero.MASCULINO)
    			.facultad(Facultad.DERECHO)
    			.totalAsignaturas(9)
    			.build(),
    			Estudiante.builder()
    			.nombre("Susana")
    			.primerApellido("Rodrigez")
    			.genero(Genero.FEMENINO)
    			.facultad(Facultad.CIENCIAS)
    			.totalAsignaturas(10)
    			.build()
    			
    	};
    	
    	for(Empleado empleado : empleados)
    		System.out.println(empleado);
    	for(Estudiante estudiante : estudiantes)
    		System.out.println(estudiante);
   
    	
    	
    }
}
