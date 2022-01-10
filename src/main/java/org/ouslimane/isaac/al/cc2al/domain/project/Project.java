package org.ouslimane.isaac.al.cc2al.domain.project;

import org.ouslimane.isaac.al.cc2al.domain.user.Job;
import org.ouslimane.isaac.al.cc2al.domain.user.Provider;
import org.ouslimane.isaac.al.cc2al.domain.user.Worker;

import java.util.List;

public final class Project {

    private final Provider provider;
    private final List<Job> jobList;
    private final List<Worker> workerList;
    private final Address address;
    private final DailyRates dailyRates;
    private final Skills skills;

    private Project(Provider provider, List<Job> jobList, List<Worker> workerList, Address address, DailyRates dailyRates, Skills skills) {
        this.provider = provider;
        this.jobList = jobList;
        this.workerList = workerList;
        this.address = address;
        this.dailyRates = dailyRates;
        this.skills = skills;
    }

    public static Project of(Provider provider, List<Job> jobList, List<Worker> workerList, Address address, DailyRates dailyRates, Skills skills){
        return new Project(provider,jobList,workerList, address, dailyRates, skills);
    }

}
