import leer.Leer;

public class main {
	public static void main(String[] args) {
		int botones;
		int dim;
		switch (Leer.pedirEntero("1 muestra 0 sale")) {
		case 1:
			do {
				botones = Leer.pedirEntero("Cuantos botones quieres");
				dim=(int) Math.sqrt(botones);
			} while ((int) Math.pow(dim,2)!= botones);
			Campo.Campo(dim);
			break;
		default:
			System.out.println("bieen");
			break;
		}
	}
}
