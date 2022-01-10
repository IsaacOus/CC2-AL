package org.ouslimane.isaac.al.cc2al.domain.service;

import org.ouslimane.isaac.al.cc2al.domain.register.Register;
import org.ouslimane.isaac.al.cc2al.domain.repository.RegisterRepository;
import org.ouslimane.isaac.al.cc2al.domain.user.Provider;

import java.util.UUID;

public final class DomainRegisterService implements RegisterService {

    private final RegisterRepository registerRepository;

    public DomainRegisterService(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    @Override
    public UUID createRegister(Provider provider) {
        final Register register =  new Register(UUID.randomUUID(), provider);
        registerRepository.save(register);
        return register.getId();
    }

    @Override
    public void addProvider(UUID id, Provider provider) {
        final Register register = getRegister(id);
        register.addRegister(provider);

        registerRepository.save(register);
    }

    @Override
    public void completeRegister(UUID id) {
        final Register register = getRegister(id);
        register.complete();

        registerRepository.save(register);
    }

    @Override
    public void deleteProvider(UUID id, UUID providerId) {
        final Register register = getRegister(id);
        register.removeRegister(providerId);

        registerRepository.save(register);
    }

    private Register getRegister(UUID id){
        return registerRepository.
                findById(id)
                .orElseThrow(() -> new RuntimeException("Register with given id doesn't exist"));
    }
}
