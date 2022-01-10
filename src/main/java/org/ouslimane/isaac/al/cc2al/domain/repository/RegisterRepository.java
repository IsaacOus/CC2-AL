package org.ouslimane.isaac.al.cc2al.domain.repository;

import org.ouslimane.isaac.al.cc2al.domain.register.Register;
import org.ouslimane.isaac.al.cc2al.domain.user.Provider;

import java.util.Optional;
import java.util.UUID;

public interface RegisterRepository {

    Optional<Register> findById(UUID id);

    void save(Register register);

}
