package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTestsOperaciones {

    public static Test suite() {
        TestSuite suite = new TestSuite(AllTestsOperaciones.class.getName());
        // $JUnit-BEGIN$
        suite.addTestSuite(DivisionTest.class);
        suite.addTestSuite(MultiplicacionTest.class);
        suite.addTestSuite(PotenciaTest.class);
        suite.addTestSuite(RaizCuadradaTest.class);
        suite.addTestSuite(RestaTest.class);
        suite.addTestSuite(SumaTest.class);
        // $JUnit-END$
        return suite;
    }

}
