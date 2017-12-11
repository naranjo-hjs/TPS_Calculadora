package test;

import logic.CalculatorLogic;
import junit.framework.TestCase;

public class BorrarMemoriaTest extends TestCase {

    /**
     * Prueba borrar la memoria
     */
    public void testBorrarMemoria() {

        CalculatorLogic calculatorLogic = new CalculatorLogic();
        double datoEsperadoAlmacenado = 0;
        double datoRealAlmacenado = 0;

        calculatorLogic.functionMemory(4);
        calculatorLogic.functionMemoryClear();
        datoRealAlmacenado = calculatorLogic.getMemory();

        if (datoRealAlmacenado != datoEsperadoAlmacenado) {
            fail();
        } else {
            // Prueba exitosa
        }
    }
}
