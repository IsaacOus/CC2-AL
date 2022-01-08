package org.ouslimane.isaac.al.cc2al.domain;

public class Worker extends User{

    private final Job job;

    private Worker(UserId userId,String lastname, String firstname, EmailAddress email,Job job) {
        super(userId, lastname, firstname, email);
        this.job = job;
    }

    public static Worker of(UserId userId, String lastname, String firstname, EmailAddress email,Job job) {
        return new Worker(userId,lastname,firstname,email,job);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "job=" + job +
                '}';
    }
}
