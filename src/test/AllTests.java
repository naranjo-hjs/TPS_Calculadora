package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTest(AllTestsMemoria.suite());
		suite.addTest(AllTestsOperaciones.suite());
		//$JUnit-END$
		return suite;
	}

}
