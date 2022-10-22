package main.groovy.fields

import com.fasterxml.jackson.annotation.JsonProperty

class Parameters {
    Parameters() {}

    @JsonProperty("parameters")
    Map<String, Object> parameters
}
