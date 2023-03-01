package com.company;

public class Employee {
    private int id;
    private static int nextId;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId;
        setName(name);
        setSurname(surname);
        setSalary(salary);
        nextId++;

    }
    public void printInfo(){
        System.out.println("Employee id: " + id + ", name: " + name + ", surname: " + surname + ", salary: " + salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId)  {
        Employee.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException{
        if(name.length()>30) throw new FieldLengthLimitException("Length must be less than 30 characters");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws FieldLengthLimitException{
        if(surname.length()>30) throw new FieldLengthLimitException("Length must be less than 30 characters");
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IncorrectSalaryException{
        if(salary<=0) throw new IncorrectSalaryException("Salary must be greater than 0");
        this.salary = salary;
    }
}
