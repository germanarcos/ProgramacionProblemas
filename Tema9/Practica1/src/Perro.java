
/**
 *
 * @author Germ�n Arcos Arag�n
 */
public class Perro extends AnimalAbstracto{
    // Sobreescribe el m�todo viveUnaHora de la clase AnimalAbstracto.
    @Override
    public void viveUnaHora(int hora){
    if ((hora>7) && (hora< 23)){
        if (hora%9==0){
            System.out.println("El perro "+nombre+" est� comiendo.");}
        if (hora%9!=0){
            if (hora%2 ==0){
                System.out.println("El perro "+nombre+" est� paseando.");}
            else {
                System.out.println("El perro "+nombre+" est� descansando.");
            }
        }
    }
    else{
            System.out.println("El perro "+nombre+" est� durmiendo");
    }
    }
    
}
