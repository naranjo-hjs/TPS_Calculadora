package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class PotenciaTest extends TestCase {

	/**
	 * Prueba la potencia 2 de un n�mero
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
