package com.example;

import com.example.Empleado.Dpt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Estudiante extends Persona {

	private Facultad facultad;
	private double totalAsignaturas;
	
	public enum Facultad{
		CIENCIAS,DERECHO,OTRO
	}
}
