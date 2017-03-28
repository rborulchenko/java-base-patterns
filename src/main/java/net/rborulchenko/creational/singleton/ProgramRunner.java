package net.rborulchenko.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProjectsStorage.getInstance().addProject("Home project");
        ProjectsStorage.getInstance().addProject("Banking system project");

        ProjectsStorage.getInstance().showProjects();
    }
}
