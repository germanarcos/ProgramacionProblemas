
/**
 *
 * @author Germán Arcos Aragón
 */
public class Perro extends AnimalAbstracto{
    // Sobreescribe el método viveUnaHora de la clase AnimalAbstracto.
    @Override
    public void viveUnaHora(int hora){
    if ((hora>7) && (hora< 23)){
        if (hora%9==0){
            System.out.println("El perro "+nombre+" está comiendo.");}
        if (hora%9!=0){
            if (hora%2 ==0){
                System.out.println("El perro "+nombre+" está paseando.");}
            else {
                System.out.println("El perro "+nombre+" está descansando.");
            }
        }
    }
    else{
            System.out.println("El perro "+nombre+" está durmiendo");
    }
    }
    
}
