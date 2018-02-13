
public class Padre {
	int anyos;
	int croquetas;
	Padre(){
		anyos=1;
		croquetas=1;
	}
	Padre(int anyos, int croquetas){
		this.anyos = anyos;
		this.croquetas= croquetas;
	}
	void visualizar(){
		System.out.println(anyos +" anyos");
		System.out.println(croquetas + " croquetas");
	}
}
