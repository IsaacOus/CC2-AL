package org.ouslimane.isaac.al.cc2al.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.ouslimane.isaac.al.cc2al.domain.register.Register;
import org.ouslimane.isaac.al.cc2al.domain.user.Provider;

public class CreateRegisterRequest {
    private Register register;

    @JsonCreator
    public CreateRegisterRequest(@JsonProperty("register") final Register register){
        this.register = register;
    }

    public Register getRegister() {
        return register;
    }
}
