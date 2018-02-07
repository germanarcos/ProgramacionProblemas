
public class Empleados {
	protected String nombre;
	protected int sueldo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void imprimeSueldo() {
		System.out.print("\nSueldo: \t"+sueldo);
	}
	public void imprimeNombre(){
		System.out.print("Nombre: \t"+nombre);

	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public void setTodo(int sueldo, String nombre){
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public void imprimeTodo(){
		imprimeNombre();
		imprimeSueldo();
	}
}
