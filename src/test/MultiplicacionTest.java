package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class MultiplicacionTest extends TestCase {

	/**
	 * Prueba la multiplicación de dos números
	 */
	public void testSuma() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double resultadoCorrecto = 4;
		double resultadoTest = 0;
		
		resultadoTest = calculatorLogic.multiply(4, 1);
		
		if (resultadoTest != resultadoCorrecto) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
