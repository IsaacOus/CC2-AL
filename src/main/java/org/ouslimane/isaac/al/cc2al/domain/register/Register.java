package org.ouslimane.isaac.al.cc2al.domain.register;

import org.ouslimane.isaac.al.cc2al.domain.project.Project;
import org.ouslimane.isaac.al.cc2al.domain.user.Provider;
import org.ouslimane.isaac.al.cc2al.exception.DomainException;

import java.util.Objects;
import java.util.UUID;

public final class Register {

    private UUID id;
    private RegisterStatus status;

    private Register(UUID id, RegisterStatus status) {
        this.id = id;
        this.status = status;
    }

    public static Register of(UUID id, RegisterStatus status){
        return new Register(id,status);
    }

    public void complete(){
        validateRegister();
        this.status = RegisterStatus.COMPLETED;
    }

    public void addRegister(final Provider provider){
        validateRegister();
        validateProvider(provider);

    }



    public void removeRegister(UUID id){
        validateRegister();

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
