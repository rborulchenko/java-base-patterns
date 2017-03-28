package net.rborulchenko.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class ProjectsStorage {
    private List<String> projects = new ArrayList<>();

    private static ProjectsStorage projectsStorage;

    private ProjectsStorage() {
    }

    public static ProjectsStorage getInstance() {
        if (projectsStorage == null) {
            projectsStorage = new ProjectsStorage();
        }

        return projectsStorage;
    }

    public void addProject(String name){
        projects.add(name);
    }

    public void showProjects(){
        for (String name : projects) {
            System.out.println(name);
        }
    }
}
