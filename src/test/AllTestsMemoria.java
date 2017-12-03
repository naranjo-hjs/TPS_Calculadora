package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTestsMemoria {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTestsMemoria.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(BorrarMemoriaTest.class);
		suite.addTestSuite(GuardarEnMemoriaTest.class);
		suite.addTestSuite(RestarAMemoriaTest.class);
		suite.addTestSuite(SumarAMemoriaTest.class);
		suite.addTestSuite(TraerMemoriaTest.class);
		//$JUnit-END$
		return suite;
	}

}
