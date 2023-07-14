package Patrones.Composite;

import java.util.List;

public interface Employee {
    String getName();

    void add(Employee var1);
    void remove(Employee var1);
    List<Employee> getEmployees();
    int calculatePoints();
}
