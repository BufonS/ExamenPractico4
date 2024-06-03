package com.example;

import com.example.Empleado.Dpt;
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
    		.build(),
    		Empleado.builder()
    		.nombre("Pedro")
    		.primerApellido("Abascal")
    		.segundoApellido("Fernandez")
    		.genero(Genero.MASCULINO)
    		.departamento(Dpt.LIMPIEZA)
    		.salario(1500)
    		.build(),
    		Empleado.builder()
    		.nombre("Anya")
    		.primerApellido("Taylor")
    		.segundoApellido("Joy")
    		.genero(Genero.FEMENINO)
    		.salario(2800)
    		.build()
    	};
    	
    	for(Empleado empleado : empleados)
    		System.out.println(empleado.getSalario());
   
    	
    	
    }
}
