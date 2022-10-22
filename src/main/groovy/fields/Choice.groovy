package main.groovy.fields

class Choice extends Base {
    protected List<String> values

    List<String> getValues() {
        return values
    }

    void setValues(List<String> values) {
        this.values = values
    }
}