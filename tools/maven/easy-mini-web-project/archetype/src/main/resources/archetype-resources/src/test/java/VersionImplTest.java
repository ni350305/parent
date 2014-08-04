#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import cn.com.commons.Version;

public class VersionImplTest extends TestCase {
	private Version version;
	public VersionImplTest(String testName) {
		super(testName);
	}
	public static Test suite() {
		return new TestSuite(VersionImplTest.class);
	}
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.version = new VersionImpl();
	}
	public void testApp() {
		assertTrue(true);
		System.out.println("Module Name:(" + this.version.getModuleName() + "),Version:("
				+ this.version.getModuleVersion() + ")!");
	}
}
