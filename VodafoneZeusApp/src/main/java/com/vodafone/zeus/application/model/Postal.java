package com.vodafone.zeus.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Postal {
    @JsonProperty("Street")
    private String street;
}