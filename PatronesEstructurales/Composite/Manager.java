package Patrones.Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private List<Employee> employees = new ArrayList();
    private String name;
    public Manager(String name){
        this.name = name;
    }
    public List<Employee> getEmployees(){
        return this.employees;
    }

    @Override
    public String getName() {
        return null;
    }

    public void add(Employee e){
        if( e!= null){
            this.employees.add(e);
        }
    }

    public void remove(Employee e){
        if(e!=null){
            this.employees.remove(e);
        }
    }
    public int calculatePoints(){
        return this.employees.isEmpty() ? 0: Math.round((float)this.employees.stream().mapToInt((e) -> {
            System.out.println(e);
            return e.calculatePoints();
        }).sum());
        }
    }

