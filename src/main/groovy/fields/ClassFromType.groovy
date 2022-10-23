package main.groovy.fields

class ClassFromType {
    final HashMap<String, Class> classFromType = [
            "boolean": Boolean.class,
            "choice": Choice.class,
    ]

    /**
     * Find and Init parameters class
     * @param type
     * @return
     */
    Class getClass(String type) {
        Class cls = classFromType[type]
        if (!cls) throw new Exception("This type (${type}) is unsupported. Please choose one of this types: ${this.getClassFromType().keySet()}")
        return cls
    }

    HashMap getClassFromType() {
        return classFromType
    }
}
