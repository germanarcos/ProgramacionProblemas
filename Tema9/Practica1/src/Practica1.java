
/**
 *
 * @author Germ�n Arcos Arag�n
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Instanciamos un nuevo corral para
         *que el usuario decida que animales introduce en �l.
         */
        Corral corral = new Corral();
        /* Llamamos al m�todo para que el usuario pueda introducir y nombrar
         * los animales que formen parte de su corral.
         */
        corral.A�adirElemento();
        /* Llamada al m�todo que simula un d�a, simulando en bucle cada hora
         * para cada animal de la LinkedList corral
         */
        corral.simulaUnD�a();
    }
    
}
