package com.vodafone.zeus.application.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RelatedCustomerAccounts {
    @JsonProperty("RelatedCustomerAccount")
    private List<RelatedCustomerAccount> relatedCustomerAccountList;
}
