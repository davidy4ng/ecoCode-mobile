package io.ecocode.java.checks.environment.leakage;

import org.junit.Test;
import org.sonar.java.checks.verifier.CheckVerifier;

public class SensorManagerLeakRuleTest {

    @Test
    public void SensorManagerOnlyRegister() {
        CheckVerifier.newVerifier().onFile("src/test/files/environment/leakage/SensorManagerLeakCheckIssue.java")
                .withCheck(new SensorManagerLeakRule())
                .verifyNoIssues();
    }

    @Test
    public void SensorManagerRegisterAndUnregister() {
        CheckVerifier.newVerifier().onFile("src/test/files/environment/leakage/SensorManagerLeakCheckNoIssue.java")
                .withCheck(new SensorManagerLeakRule())
                .verifyNoIssues();
    }
}
