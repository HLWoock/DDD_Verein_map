package de.woock.domain.schufa;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Antwort (@JsonProperty("bonitaet") Bonitaet bonitaet,
                       @JsonProperty("name")     String name) {}