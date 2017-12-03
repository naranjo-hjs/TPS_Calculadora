package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class SumarAMemoriaTest extends TestCase {

	/**
	 * Prueba sumar algun valor a la memoria
	 */
	public void testSumarMemoria() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double datoEsperadoAlmacenado = 4;
		double datoRealAlmacenado = 0;
		
		calculatorLogic.functionMemory_plus(4);
		datoRealAlmacenado = calculatorLogic.getMemory();
		
		if (datoRealAlmacenado != datoEsperadoAlmacenado) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
