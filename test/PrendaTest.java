import org.junit.*;

import prueba.Prenda;

public class PrendaTest {
	
	@Test //Le indico que el metodo sera un test
	public void validarNombreFancy(){
		Prenda pantalon=new Prenda("Pantalon");
		Assert.assertEquals("super duper Pantalon", pantalon.nombreFancy());
	}
	
}
 