package org.ouslimane.isaac.al.cc2al.domain.user;

import org.ouslimane.isaac.al.cc2al.domain.project.Project;

import java.util.List;

public final class Provider {

    private User user;
    private final List<Project> projectList;

    private Provider(User user, List<Project> projectList) {
        this.user = user;
        this.projectList = projectList;
    }

    public static Provider of(User user, List<Project> projectList){
        return new Provider(user,projectList);
    }

}
