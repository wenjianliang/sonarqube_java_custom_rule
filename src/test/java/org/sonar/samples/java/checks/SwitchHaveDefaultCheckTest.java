package org.sonar.samples.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;
import org.sonar.samples.java.checks.flowcontrol.SwitchHaveDefaultCheck;

public class SwitchHaveDefaultCheckTest {
	@Test
	public void test() {
		//JavaCheckVerifier.verify("src/test/files/flow/SwitchLastCaseIsDefaultCheck.java",new SwitchHaveDefaultCheck());
	}
}
