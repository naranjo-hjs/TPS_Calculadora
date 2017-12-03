package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class RestaTest extends TestCase {

	/**
	 * Prueba la resta de dos números
	 */
	public void testResta() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double resultadoCorrecto = 4;
		double resultadoTest = 0;
		
		resultadoTest = calculatorLogic.subtract(6, 2);
		
		if (resultadoTest != resultadoCorrecto) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
