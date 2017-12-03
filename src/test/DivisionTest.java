package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class DivisionTest extends TestCase {

	/**
	 * Prueba la división de dos números
	 */
	public void testSuma() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double resultadoCorrecto = 4;
		double resultadoTest = 0;
		
		resultadoTest = calculatorLogic.divide(8, 2);
		
		if (resultadoTest != resultadoCorrecto) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
