package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class GuardarEnMemoriaTest extends TestCase {

    /**
     * Prueba el guardado en memoria
     */
    public void testGuardarEnMemoria() {

        CalculatorLogic calculatorLogic = new CalculatorLogic();
        double datoEsperadoAlmacenado = 4;
        double datoRealAlmacenado = 0;

        calculatorLogic.functionMemory(4);
        datoRealAlmacenado = calculatorLogic.getMemory();

        if (datoRealAlmacenado != datoEsperadoAlmacenado) {
            fail();
        } else {
            // Prueba exitosa
        }
    }
}
