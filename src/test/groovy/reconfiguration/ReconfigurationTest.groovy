package test.groovy.reconfiguration

import main.groovy.reconfiguration.Reconfiguration
import org.junit.Before
import org.junit.Test

class ReconfigurationTest {

    final String SOURCE_PATH = "src/test/resources/configurations"
    Reconfiguration reconfiguration

    @Before
    void call() {
        this.reconfiguration = new Reconfiguration()
    }

    @Test
    void readConfigurationFile() {
        def fields = reconfiguration.readConfigurationFile("${SOURCE_PATH}/allSupportedTypes.yaml")
        print(1)
        // create classes by hand and compare with read configuration file
    }

    @Test
    void readUnsupportedType() {
        def fields = reconfiguration.readConfigurationFile("${SOURCE_PATH}/unsupportedType.yaml")
        // throw exception
    }

    // Check invalid yaml file

    // Check invalid yaml structure
}