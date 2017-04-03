package net.rborulchenko.creational.prototype;

public class ProjectFactory {
    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project copyProject() {
        return (Project) project.copy();
    }
}
