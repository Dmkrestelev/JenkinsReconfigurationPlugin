package main.groovy.reconfiguration

class JenkinsApi {
    // Jenkins WorkflowScript
    static Script script
    List<Object> parameters = []

    JenkinsApi(Script script) {
        this.script = script
    }


    void call() {
        script.properties([
                script.parameters(parameters)
        ])
    }


    void activeChoiceReferenceParameters(String name,
                                        String groovyScript,
                                        String fallbackScript,
                                        String description,
                                        List<String> referencedParameters
    ) {
        // collect information
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
        parameters.add(parameter)
    }
}
