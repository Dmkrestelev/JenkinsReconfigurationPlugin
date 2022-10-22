package main.groovy.fields

// base class for all types
class Base {
    protected String name
    protected List<String> referencedParameters
    protected String description

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
}