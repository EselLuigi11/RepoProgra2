package modelo;

import java.util.Scanner;
import test.PruebaVehiculos;

public class Persona {
	private String nombre;
	private String genero;
	private int edad;
	private ListaVehiculo vehiculos;
	
	public Persona(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.vehiculos = new ListaVehiculo();
	}
	public static Persona ingresarConductor(Scanner s) {
		String genero= PruebaVehiculos.obtenerGenero(s);
		System.out.println("Ingrese el nombre del conductor: ");
		String nombre = s.nextLine();
		System.out.println("Ingrese la edad del conductor: ");
		int edad = Integer.parseInt(s.nextLine()); 
		return new Persona(nombre,edad,genero);
	}
		
    public void agregarVehiculo(Vehiculo v) {
        vehiculos.insertarUltimo(v); // se va agregando al final
    }
    
    
    
    
    
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", vehiculos=" + vehiculos + "]";
	}


}
