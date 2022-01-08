package org.ouslimane.isaac.al.cc2al.domain;

import java.util.Objects;

public class User {

    private final UserId userId;
    private final String lastname;
    private final String firstname;
    private final EmailAddress email;


    protected User(UserId userId, String lastname, String firstname, EmailAddress email){
        this.userId = userId;
        this.lastname = Objects.requireNonNull(lastname);
        this.firstname = Objects.requireNonNull(firstname);
        this.email = Objects.requireNonNull(email);
    }

    public static User of(UserId userId,String lastname, String firstname, EmailAddress email){
        return new User(userId, lastname,firstname,email);
    }

    UserId getUserId(){
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email=" + email +
                '}';
    }
}
