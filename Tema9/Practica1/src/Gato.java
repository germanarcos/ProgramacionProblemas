
/**
 *
 * @author Germ�n Arcos Arag�n
 */
public class Gato extends AnimalAbstracto {
    // Sobreescribe el m�todo viveUnaHora de la clase AnimalAbstracto.
    @Override
    public void viveUnaHora(int hora){
        if((hora<10) || (hora>20)){
            if(hora%7==2){
            System.out.println("El gato "+nombre+" est� observando a los perros.");
            }
            if (hora%5==2){
            System.out.println("El gato "+nombre+" est� comiendo.");
            }
        } else{
        System.out.println("El gato "+nombre+" est� durmiendo.");
        }
    }
}
