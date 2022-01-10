package org.ouslimane.isaac.al.cc2al.domain.user;

import org.ouslimane.isaac.al.cc2al.domain.project.Project;

import java.util.List;

public final class Provider {

    private User user;
    private List<Project> projectList;

    private Provider(User user, List<Project> projectList) {
        this.user = user;
        this.projectList = projectList;
    }

    private Provider(User user){
        this.user = user;
    }
    public static Provider of(User user, List<Project> projectList){
        return new Provider(user,projectList);
    }

    public static Provider ofNoProject(User user){
        return new Provider(user);
    }
    public UserId getProviderId(){
        return user.getUserId();
    }
}
