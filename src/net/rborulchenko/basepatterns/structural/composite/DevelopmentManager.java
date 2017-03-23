package net.rborulchenko.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DevelopmentManager implements Employee {

    private List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public Employee getChild(int id) {
        return employees.get(id);
    }

    @Override
    public void doJob() {
        System.out.println("Manager manages software development... \n");

        for (Employee employee : employees) {
            employee.doJob();
        }
    }
}
