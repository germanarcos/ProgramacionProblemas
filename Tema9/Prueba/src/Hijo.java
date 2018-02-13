
public class Hijo extends Padre{
	int dientes;
	Hijo(){
		dientes=0;
	}
	Hijo(int anyos, int croquetas){
		this.anyos=anyos;
		this.croquetas=croquetas;
		dientes=0;
	}
	Hijo(int anyos, int croquetas, int dientes){
		super(anyos, croquetas);
		this.dientes=dientes;
	}
	@Override
	void visualizar(){
		System.out.println(anyos +" anyos");
		System.out.println(croquetas + " croquetas");
		System.out.println(dientes + " dientes");
	}
}

