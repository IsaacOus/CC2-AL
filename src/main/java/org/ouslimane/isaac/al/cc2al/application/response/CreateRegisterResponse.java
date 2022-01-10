package org.ouslimane.isaac.al.cc2al.application.response;

import java.util.UUID;

public class CreateRegisterResponse {
    private final UUID id;

    public  CreateRegisterResponse(final UUID id){
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
