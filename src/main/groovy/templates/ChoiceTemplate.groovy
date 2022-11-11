package main.groovy.templates

class ChoiceTemplate {
    HashMap<String, String> cssClasses = [
           "option":  "choiceOption",
           "select":  "choiceSelect",
    ]

    /**
     * Generate html select
     * @param values - List of values
     * @return
     */
    String html(List<String> values = [""]) {
        String options = values.collect { value ->
            return "<option class='${cssClasses.option}' value='${value}' name='${value}'>${value}</option>"
        }.join("\n")

        return "<select class='${cssClasses.select}'>${options}</select>"
    }
}
