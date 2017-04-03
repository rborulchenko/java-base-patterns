package net.rborulchenko.creational.prototype;

public class Project implements Copyable {
    private int id;
    private String projctName;
    private String sourceCode;

    public Project(int id, String projctName, String sourceCode) {
        this.id = id;
        this.projctName = projctName;
        this.sourceCode = sourceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjctName(String projctName) {
        this.projctName = projctName;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        return new Project(id, projctName, sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projctName='" + projctName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
