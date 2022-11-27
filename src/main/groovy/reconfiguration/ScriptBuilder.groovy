package main.groovy.reconfiguration

class ScriptBuilder {
    JenkinsApi jenkinsApi

    ScriptBuilder(JenkinsApi jenkinsApi) {
        this.jenkinsApi = jenkinsApi
    }

    /**
     * Build html
     * @param field
     * @return
     */
    String build(cssFilePath, templatePath) {
        String result = ""
        // collect css file
        result += JenkinsApi.getFileFromLibraryResources(cssFilePath)
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
