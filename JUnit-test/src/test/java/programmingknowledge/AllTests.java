package programmingknowledge;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AddTest.class, ConcatTest.class })
public class AllTests {

}
