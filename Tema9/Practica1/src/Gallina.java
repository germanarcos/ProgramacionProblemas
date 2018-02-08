
/**
 *
 * @author Germán Arcos Aragón
 */
public class Gallina extends AnimalAbstracto{
    // Sobreescribe el método viveUnaHora de AnimalAbstracto.
    @Override
    public void viveUnaHora(int hora){
        if ((hora>5) && (hora < 21)){
            if(hora%6 == 1){
                System.out.println("La gallina " +nombre+ " está poniendo un huevo.");}
            if(hora%3 == 0){
                System.out.println("La gallina " +nombre+ " está comiendo");
            }
        }
        else{
            System.out.println("La gallina "+nombre+" está durmiendo");
        }
    }

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}
}
