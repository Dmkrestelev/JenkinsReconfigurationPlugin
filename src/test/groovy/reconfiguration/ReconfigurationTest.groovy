package test.groovy.reconfiguration

import main.groovy.reconfiguration.Reconfiguration
import org.junit.Test

class ReconfigurationTest {

    @Test
    void readConfigurationFile() {
        Reconfiguration reconfiguration = new Reconfiguration()
        Object configurationFile = reconfiguration.readConfigurationFile("src/test/resources/configurations/boolean.yaml")

        // create classes by hands and compare with read configuration file
    }
}