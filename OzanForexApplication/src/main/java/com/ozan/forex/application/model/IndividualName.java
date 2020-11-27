package com.ozan.forex.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndividualName {
    @JsonProperty("Title")
    private Object title;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("FamilyName")
    private String familyName;
}
