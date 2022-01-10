package org.ouslimane.isaac.al.cc2al.domain.register;

import org.ouslimane.isaac.al.cc2al.domain.user.Provider;
import org.ouslimane.isaac.al.cc2al.exception.DomainException;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class Register {

    private UUID id;
    private RegisterStatus status;
    private List<Provider> providerList;

    public Register(UUID id, Provider provider) {
        this.id = id;
        this.status = status;
        this.providerList = providerList;
    }

    public void complete(){
        validateRegister();
        this.status = RegisterStatus.COMPLETED;
    }

    public void addRegister(final Provider provider){
        validateRegister();
        validateProvider(provider);
        providerList.add(provider);
    }

    public void removeRegister(final UUID id){
        validateRegister();
        final Provider provider = getProvider(id);
        providerList.remove(provider);
    }

    private Provider getProvider(final UUID id){
        return providerList.stream()
                .filter(provider -> provider.getProviderId()
                .equals(id))
                .findFirst()
                .orElseThrow(() -> new DomainException("Provider with " + id + "doesn't exist."));
    }

    public UUID getId() {
        return id;
    }

    public RegisterStatus getStatus() {
        return status;
    }

    private void validateRegister(){
        if (RegisterStatus.COMPLETED.equals(status)){
            throw new DomainException("The register is in completed state. ");
        }
    }

    private void validateProvider(final Provider provider) {
        if(provider == null){
            throw new DomainException("The provider cannot be null");
        }

    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Register register = (Register) o;
        return Objects.equals(id, register.id) && status == register.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }
}
