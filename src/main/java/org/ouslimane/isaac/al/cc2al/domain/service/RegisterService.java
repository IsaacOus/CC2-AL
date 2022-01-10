package org.ouslimane.isaac.al.cc2al.domain.service;

import org.ouslimane.isaac.al.cc2al.domain.user.Provider;

import java.util.UUID;

public interface RegisterService {

    UUID createRegister(Provider provider);

    void addProvider(UUID id, Provider provider);

    void completeRegister(UUID id);

    void deleteProvider(UUID id, UUID providerId);


}
