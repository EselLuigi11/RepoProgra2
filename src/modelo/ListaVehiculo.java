package modelo;

public class ListaVehiculo {
	private NodoVehiculo primero;
    private NodoVehiculo ultimo;
    private int cantidad;

    public ListaVehiculo() {
        this.primero = null;
        this.ultimo = null;
        this.cantidad = 0;
    }

    public void insertarUltimo(Vehiculo v) {
        NodoVehiculo nuevo = new NodoVehiculo(v);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        cantidad++;
    }
    
	public void insertarPrimero(Vehiculo v) {
		NodoVehiculo nuevo = new NodoVehiculo(v);
		if (primero == null) {        // Lista vacía
	        primero = nuevo;
	        ultimo = nuevo;
	    } else {                      // Lista no vacía
	        nuevo.setSiguiente(primero);    // Nuevo apunta hacia el antiguo primero
	        primero.setAnterior(nuevo);    // Antiguo primero apunta hacia atrás al nuevo
	        primero = nuevo;          // Actualizamos primero
	    }
	}
	
	
	public NodoVehiculo buscar(Vehiculo v) {
		NodoVehiculo actual=primero;
		while(actual!= null) {
			if (actual.equals(v)) {
				return actual;
			}
			actual = actual.getSiguiente();
		}
		return null;
	}
	
	
	public void eliminar(Vehiculo v) {
		NodoVehiculo nodo = buscar(v);
		if (nodo == null) 
			return;
		if (nodo.getAnterior() != null) {
			nodo.getAnterior().setSiguiente(nodo.getSiguiente()); 
		}
///En esta linea lo que decimos es que pase el siguiente nodo
/// del nodo que queremos eliminar al siguiente del anterior. Es como superponer el siguiente en la posicion del 
///que buscamos, eliminandolo.
		else {
			primero =nodo.getSiguiente();
		}
		if (nodo.getSiguiente() != null) {
            nodo.getSiguiente().setAnterior(nodo.getAnterior());
        } else {
            ultimo = nodo.getAnterior();
        }
	}	

	@Override
	public String toString() {
		return "ListaVehiculo [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + "]";
	}

	public NodoVehiculo getPrimero() {
		return primero;
	}

	public void setPrimero(NodoVehiculo primero) {
		this.primero = primero;
	}

	public NodoVehiculo getUltimo() {
		return ultimo;
	}

	public void setUltimo(NodoVehiculo ultimo) {
		this.ultimo = ultimo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

        
}



