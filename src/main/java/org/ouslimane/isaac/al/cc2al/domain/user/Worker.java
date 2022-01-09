package org.ouslimane.isaac.al.cc2al.domain.user;

public final class Worker {

    private final Job job;
    private final User user;

    private Worker(User user,Job job) {
        this.user = user;
        this.job = job;
    }

    public Worker of(User user,Job job){
        return new Worker(user,job);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "job=" + job +
                '}';
    }
}
