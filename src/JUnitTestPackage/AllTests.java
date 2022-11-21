package JUnitTestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JUnitFunctionsTest.class, JUnitFunctionsTest2.class })
public class AllTests {

}
