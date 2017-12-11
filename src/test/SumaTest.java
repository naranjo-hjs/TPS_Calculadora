package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class SumaTest extends TestCase {

    /**
     * Prueba la suma de dos números
     */
    public void testSuma() {

        CalculatorLogic calculatorLogic = new CalculatorLogic();
        double resultadoCorrecto = 4;
        double resultadoTest = 0;

        resultadoTest = calculatorLogic.add(2, 2);

        if (resultadoTest != resultadoCorrecto) {
            fail();
        } else {
            // Prueba exitosa
        }
    }
}
