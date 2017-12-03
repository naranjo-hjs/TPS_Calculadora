package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class DivisionTest extends TestCase {

	/**
	 * Prueba la división de dos números
	 */
	public void testDivision() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		double resultadoCorrecto = 4;
		double resultadoTest = 0;
		
		resultadoTest = Double.parseDouble(calculatorLogic.divide(8, 2));
		
		if (resultadoTest != resultadoCorrecto) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
	
	/**
	 * Prueba la división por cero
	 */
	public void testDivisionPorCero() {
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		String resultadoTest = "";
		
		resultadoTest = calculatorLogic.divide(4, 0);
		
		if (!resultadoTest.equals("Error.")) {
			fail();
		} else {
			//Prueba exitosa
		}
	}
}
