package modelo;

public class NodoVehiculo {
	private Vehiculo dato;
	private NodoVehiculo siguiente;
	private NodoVehiculo anterior;
	
	public NodoVehiculo(Vehiculo dato ) {
		this.dato = dato;
		this.siguiente = null;
		this.anterior=null;
	}

	public Vehiculo getDato() {
		return dato;
	}

	public void setDato(Vehiculo dato) {
		this.dato = dato;
	}

	public NodoVehiculo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoVehiculo siguiente) {
		this.siguiente = siguiente;
	}

	public NodoVehiculo getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoVehiculo anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "NodoVehiculo [dato=" + dato + ", siguiente=" + siguiente + ", anterior=" + anterior + "]";
	}


	
}
	