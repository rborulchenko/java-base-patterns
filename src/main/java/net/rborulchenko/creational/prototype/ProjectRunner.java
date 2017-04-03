package net.rborulchenko.creational.prototype;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "Java patterns", "Some java code here...");
        System.out.println(project);

        ProjectFactory factory = new ProjectFactory(project);
        Project projectCopy = factory.copyProject();
        System.out.println(projectCopy);
    }
}
