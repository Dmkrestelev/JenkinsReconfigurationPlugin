package main.groovy.fields

class Choice extends Base {
    protected List<String> values

    Choice(LinkedHashMap<String, Object> parameters,
           LinkedHashMap<String, Object> configurations) {
        super(parameters)
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