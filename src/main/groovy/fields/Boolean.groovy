package main.groovy.fields

class Boolean extends Base {
    protected boolean defaultValue

    boolean getDefaultValue() {
        return defaultValue
    }

    void setDefaultValue(boolean defaultValue) {
        this.defaultValue = defaultValue
    }
}