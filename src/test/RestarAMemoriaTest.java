package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class RestarAMemoriaTest extends TestCase {

	/**
	 * Prueba restar algun valor a la memoria
	 */
	public void testRestarMemoria() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double datoEsperadoAlmacenado = -4;
		double datoRealAlmacenado = 0;
		
		calculatorLogic.functionMemory_minus(4);
		datoRealAlmacenado = calculatorLogic.getMemory();
		
		if (datoRealAlmacenado != datoEsperadoAlmacenado) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
