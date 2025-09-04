package modelo;

import java.util.Scanner;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;


public Vehiculo(String marca, String modelo, String color) {
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
}
public static Vehiculo ingresarVehiculo(Scanner s) {
	System.out.println("Ingrese la marca del vehiculo: ");
	String marca = s.nextLine();
		
	System.out.println("Ingrese el modelo del vehiculo: ");
	String modelo = s.nextLine();
		
	System.out.println("Ingrese el color del vehiculo: ");
	String color = s.nextLine();
	return new Vehiculo(marca,modelo,color);
	
}
@Override
public String toString() {
	return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}



}
