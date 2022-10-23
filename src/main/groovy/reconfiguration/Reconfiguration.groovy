package main.groovy.reconfiguration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import main.groovy.fields.ClassFromType
import main.groovy.fields.Parameters

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
     * Parse file configuration to classes
     * @param parameters
     * @return
     */
    static List<Object> parse(HashMap<String, HashMap> parameters) {
        List<Object> result = []
        parameters.each { key, values ->
            ClassFromType cft = new ClassFromType()
            values.put("name", key)
            Class cls = cft.getClass(values["type"] as String)
            Object obj = cls.newInstance(values, values["configurations"])
            result.add(obj)
        }
        return result
    }
}
