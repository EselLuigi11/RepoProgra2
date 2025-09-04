package modelo;
import modelo.Nodo;

public class Lista {
	private Nodo primero;
	private Nodo ultimo;
	private int cantidad;
	
	public Lista() {
	this.primero = null;
	this.ultimo = null;
	this.cantidad=0;
	}
	

	public Nodo buscar(int dato) {
		Nodo actual=primero;
		while(actual!= null) {
			if (actual.equals(dato)) {
				return actual;
			}
			actual = actual.getSiguiente();
		}
		return null;
	}
	
	public void eliminar(int dato) {
		Nodo nodo = buscar(dato);
		if (nodo == null) return;
		
		if (nodo.getAnterior() != null) {
			nodo.getAnterior().setSiguiente(nodo.getSiguiente()); ///En esta linea lo que decimos es que pase el siguiente nodo
			/// del nodo que queremos eliminar al siguiente del anterior. Es como superponer el siguiente en la posicion del 
			///que buscamos, eliminandolo.
		}
		else {
			primero =nodo.getSiguiente();
		}
		if (nodo.getSiguiente() != null) {
            nodo.getSiguiente().setAnterior(nodo.getAnterior());
        } else {
            ultimo = nodo.getAnterior();
        }
	}
	
	public void insertarUltimo(int dato) {
		Nodo nuevo = new Nodo(dato);
		if (primero == null) {
			primero = nuevo;
			ultimo = nuevo;
		}
		else {
			ultimo.setSiguiente(nuevo); //El ultimo apuntara ahora al nodo nuevo que sera el nuevo ultimo.
			nuevo.setAnterior(ultimo); //El nuevo que ahora es ultimo setea como anterior el anterior ultimo.
			ultimo = nuevo; //modificamos la variable ultimo definitivamente por el nuevo Nodo ultimo.			
		}
	}
	
	public void insertarPrimero(int dato) {
		Nodo nuevo = new Nodo(dato);
		if (primero == null) {        // Lista vacía
	        primero = nuevo;
	        ultimo = nuevo;
	    } else {                      // Lista no vacía
	        nuevo.setSiguiente(primero);    // Nuevo apunta hacia el antiguo primero
	        primero.setAnterior(nuevo);    // Antiguo primero apunta hacia atrás al nuevo
	        primero = nuevo;          // Actualizamos primero
	    }
	}
	
	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	public Nodo getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo ultimo) {
		this.ultimo = ultimo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Lista [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + "]";
	} 
	
}
