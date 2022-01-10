package org.ouslimane.isaac.al.cc2al.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.ouslimane.isaac.al.cc2al.domain.user.Provider;

public class CreateProviderRequest {
    private Provider provider;

    @JsonCreator
    public CreateProviderRequest(@JsonProperty("provider") final Provider provider){
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }
}
