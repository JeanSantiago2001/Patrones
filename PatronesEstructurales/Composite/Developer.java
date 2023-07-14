package Patrones.Composite;

import java.util.List;

public class Developer implements Employee {
    String name;

    public Developer(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void add(Employee e){

    }
    public void remove (Employee e){

    }
    public List<Employee> getEmployees(){
        return null;
    }

    @Override
    public int calculatePoints() {
        return 0;
    }
}
