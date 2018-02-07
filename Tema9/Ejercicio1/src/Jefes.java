
public class Jefes extends Empleados {
	private String titulo;
	private String departamento;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setTodo(int sueldo, String nombre, String titulo, String departamento){
		super.setTodo(sueldo, nombre);
		setTitulo(titulo);
		setDepartamento(departamento);
	}

	public void imprimeTitulo() {
		System.out.print("\nTitulo: \t" + titulo);
	}

	public void imprimeDepartamento() {
		System.out.print("\nDepartamento:\t" + departamento);
	}

	public void imprimeTodo() {
		super.imprimeTodo();
		imprimeTitulo();
		imprimeDepartamento();
	}
}
