package test;

import java.util.Scanner;

import modelo.Persona;
import modelo.Vehiculo;

public class PruebaVehiculos {
	
///FUNCIONES///	
public static String obtenerGenero(Scanner s) {
	String genero;
	System.out.println("Ingrese su genero (M/F/O) (otro): ");
	genero = s.nextLine().toLowerCase();
	while(true) {
		if (genero.equals("m") || genero.equals("f") || genero.equals("o")){
			return genero;
		}
		else {
			System.out.println("Invalido, intente de nuevo (M/F/O) (otro): ");
			genero = s.nextLine().toLowerCase();
		}
	}
}

///MAIN////
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n ----- INGRESAR USUARIO ----- \n");
		Persona persona = modelo.Persona.ingresarConductor(s);		
		
		System.out.println("\n ----- INGRESAR VEHICULOS ----- \n");
		System.out.println("Cuántos vehiculos desea ingresar?: ");
		int indice = Integer.parseInt(s.nextLine()); 
		Vehiculo[] v = new Vehiculo[indice];
		for (int i=0; i<indice ; i++) {
			System.out.println("Vehículo n°: "+ (i+1));
			v[i] = modelo.Vehiculo.ingresarVehiculo(s);
		}
	
	System.out.println("\\n ----- LISTA DE VEHICULOS INGRESADOS ----- ");
	for (int j=0 ; j<v.length ; j++) {
	System.out.println(v[j].toString());
	persona.agregarVehiculo(v[j]);
	}
	
	System.out.println("\n ----- Datos de: "+ persona.getNombre() +" ----- ");
	System.out.println(persona.toString());
	
	
	}
	
}
