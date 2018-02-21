
public class Pila {
	Integer[] pila = new Integer[500];
	int index = 0;

	public int pop() {
		int valor = pila[index];
		pila[index] = null;
		return valor;
	}

	public void add(int entero) {
		pila[index]=entero;
	}

	public Pila copy() {
		return this;
	}

	public void borrar() {
		for (int i = 0; i < pila.length; i++) {
			pila[i] = null;
		}
	}

	public boolean vacia() {
		if (pila[0] == null) {
			return true;
		} else {
			return false;
		}
	}
	public Pila invertir(){
		int aux;
		
		for (int i = 0;i < index/2;i++){
			aux = pila[i];
			pila[i]=pila[index-i];
			pila[index-i]=aux;
		}
		return this;
	}
}
