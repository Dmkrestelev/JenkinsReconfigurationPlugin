package main.groovy.fields

class Boolean extends Base {
    boolean defaultValue

    Boolean(LinkedHashMap<String, Object> parameters,
            LinkedHashMap<String, Object> configurations) {
        super(parameters)
        this.defaultValue = configurations?.defaultValue
    }

    boolean getDefaultValue() {
        return defaultValue
    }

    Boolean setDefaultValue(boolean defaultValue) {
        this.defaultValue = defaultValue
        return this
    }
}