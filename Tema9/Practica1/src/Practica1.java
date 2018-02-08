
/**
 *
 * @author Germán Arcos Aragón
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Instanciamos un nuevo corral para
         *que el usuario decida que animales introduce en él.
         */
        Corral corral = new Corral();
        /* Llamamos al método para que el usuario pueda introducir y nombrar
         * los animales que formen parte de su corral.
         */
        corral.AñadirElemento();
        /* Llamada al método que simula un día, simulando en bucle cada hora
         * para cada animal de la LinkedList corral
         */
        corral.simulaUnDía();
    }
    
}
