package main.groovy.fields

class ClassFromType {
    final HashMap<String, Object> classFromType = [
            "boolean": new Boolean(),
            "choice": new Choice(),
    ]

    Object getClass(String type) {
        return classFromType[type]
    }

    HashMap getClassFromType() {
        return classFromType
    }
}
