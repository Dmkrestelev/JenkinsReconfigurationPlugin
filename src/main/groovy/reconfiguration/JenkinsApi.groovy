package main.groovy.reconfiguration

class JenkinsApi {
    // Jenkins WorkflowScript
    static Script script
    // Jenkins Job parameters
    List<Object> parameters = []
    // local resources path
    static String resources

    JenkinsApi(Script script, resources="../../resources") {
        this.script = script
        this.resources = resources
    }

    /**
     * Get file from library resource
     * @param filePath
     * @return
     */
    static String getFileFromLibraryResources(String filePath) {
        script.libraryResource(resources + "/" + filePath)
    }


    /**
     * Set Jenkins Job parameters
     */
    void setProperties() {
        script.properties([script.parameters(parameters)])
    }


    /**
     * Generate jenkins API parameter
     * @param name
     * @param groovyScript
     * @param fallbackScript
     * @param description
     * @param referencedParameters
     * @return
     */
    Map<String, Object> activeChoiceReferenceParameters(String name,
                                        String groovyScript,
                                        String fallbackScript,
                                        String description,
                                        List<String> referencedParameters
    ) {
        Map<String, Object> parameter = [
                $class: 'DynamicReferenceParameter',
                choiceType: 'ET_FORMATTED_HTML',
                description: description,
                name: name,
                omitValueField: false,
//                randomName: 'choice-parameter-15806500799482', // TODO set random
                referencedParameters: referencedParameters,
                script: [
                        $class: 'GroovyScript',
                        script: [
                                classpath: [],
                                oldScript: '',
                                sandbox: false,
                                script: groovyScript
                        ],
                        fallbackScript: [
                                classpath: [],
                                oldScript: '',
                                sandbox: false,
                                script: fallbackScript
                        ]
                ]
        ]
        // add to parameters List
//        parameters.add(parameter)
        return parameter
    }
}
