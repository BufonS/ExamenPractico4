package com.example;

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
public class Empleado extends Persona{
	private Dpt departamento;
	private double salario;
	
	public enum Dpt{
		INFORMATICA,RRHH,LIMPIEZA
	}
}
