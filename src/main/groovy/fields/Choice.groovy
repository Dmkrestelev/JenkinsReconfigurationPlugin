package main.groovy.fields

import main.groovy.templates.choice.ChoiceTemplate

class Choice extends Base {
    List<String> values = []
    String templateClass = ChoiceTemplate.class

    String cssFilePath = "choice/choice.css"

    // TODO validate input data before create an object
    Choice(LinkedHashMap<String, Object> parameters,
           LinkedHashMap<String, Object> configurations) {
        // call super constructor
        super(parameters)
        // set template
        super.template = templateClass
        // set configurations
        this.values = configurations?.values as List<String>
    }

    List<String> getValues() {
        return values
    }

    Choice setValues(List<String> values) {
        this.values = values
        return this
    }
}