package main.groovy.reconfiguration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import main.groovy.fields.ClassFromType
import main.groovy.fields.Parameters

import java.lang.reflect.Field

class Reconfiguration {
    /**
     * Call Jenkins api
     */
    void call() {

    }

    /**
     * Read configuration from file
     * @param filePath - path to configuration file
     * @return
     */
    static Object readConfigurationFile(String filePath) {
        try {
            File file = new File(filePath)
            if (!file.exists()) throw new Exception("File not found in ${filePath}")
            // read file with Jackson and parse to classes
            ObjectMapper mapper = new YAMLMapper()
            Parameters parameters = mapper.readValue(file, Parameters.class)
            return parse(parameters.parameters as HashMap)
        } catch (Exception e) {
            e.printStackTrace()
        }
    }

    /**
     *
     */
    static parse(HashMap<String, Object> parameters) {
        List<Object> result
        parameters.each { key, values ->
            ClassFromType cft = new ClassFromType()
            Object cls = cft.getClass(values["type"] as String)
            if (!cls) throw new Exception("This type (${values["type"]}) is unsupported. Please choose one of this types: ${cft.getClassFromType().keySet()}")

            Field[] allFields = cls.class.getDeclaredFields()
            allFields.each { field ->
//                values.
                print(field)
            }
//            cls.setName(key).setDescription(values)

            result.add(cls)
        }
    }
}
