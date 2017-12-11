package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class RaizCuadradaTest extends TestCase {

    /**
     * Prueba la ra�z cuadrada de un n�mero
     */
    public void testRaizCuadrada() {

        CalculatorLogic calculatorLogic = new CalculatorLogic();
        double resultadoCorrecto = 4;
        double resultadoTest = 0;

        resultadoTest = calculatorLogic.squareRoot(16);

        if (resultadoTest != resultadoCorrecto) {
            fail();
        } else {
            // Prueba exitosa
        }
    }
}
