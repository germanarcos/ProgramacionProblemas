
/**
 *
 * @author Germ�n Arcos Arag�n
 */
public class Gallina extends AnimalAbstracto{
    // Sobreescribe el m�todo viveUnaHora de AnimalAbstracto.
    @Override
    public void viveUnaHora(int hora){
        if ((hora>5) && (hora < 21)){
            if(hora%6 == 1){
                System.out.println("La gallina " +nombre+ " est� poniendo un huevo.");}
            if(hora%3 == 0){
                System.out.println("La gallina " +nombre+ " est� comiendo");
            }
        }
        else{
            System.out.println("La gallina "+nombre+" est� durmiendo");
        }
    }

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}
}
