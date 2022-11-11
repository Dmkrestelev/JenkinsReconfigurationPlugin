package main.groovy.fields

// Base class for all parameters
class Base {
    String name
    List<String> referencedParameters
    String description
    Object template
    String cssFilePath

    Base(LinkedHashMap<String, Object> parameters) {
        this.name = parameters?.name as String
        this.referencedParameters = parameters?.referencedParameters as List<String>
        this.description = parameters?.description as String
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    List<String> getReferencedParameters() {
        return referencedParameters
    }

    void setReferencedParameters(List<String> referencedParameters) {
        this.referencedParameters = referencedParameters
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String generate() {
        String result = ""
        // read css file
        // prepare fields for template
        // read html template
        // add callback script
        // return callHtml
    }

    // TODO add something like a callback to process an answers
    /**
     * Callback script
     */
    void callback() {

    }

    /**
     * fallback script
     */
    void fallback() {

    }
}