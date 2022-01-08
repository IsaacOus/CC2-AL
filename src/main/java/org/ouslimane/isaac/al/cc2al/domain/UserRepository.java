package org.ouslimane.isaac.al.cc2al.domain;

import java.util.UUID;

public interface UserRepository {

    void save(User user);

    User byId(UserId userId);

    default UserId nextId(){
        return UserId.fromUUID(UUID.randomUUID());
    }

}
