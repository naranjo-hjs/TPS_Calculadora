package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class PotenciaTest extends TestCase {

	/**
	 * Prueba la potencia 2 de un número
	 */
	public void testSuma() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double resultadoCorrecto = 16;
		double resultadoTest = 0;
		
		resultadoTest = calculatorLogic.pow(4);
		
		if (resultadoTest != resultadoCorrecto) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
