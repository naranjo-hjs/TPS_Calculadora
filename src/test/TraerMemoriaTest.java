package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class TraerMemoriaTest extends TestCase {

	/**
	 * Prueba traer el valor la memoria
	 */
	public void testTraerMemoria() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double datoEsperadoAlmacenado = 4;
		double datoRealAlmacenado = 0;
		
		calculatorLogic.functionMemory(4);
		datoRealAlmacenado = calculatorLogic.functionMemory_recall();
		
		if (datoRealAlmacenado != datoEsperadoAlmacenado) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
