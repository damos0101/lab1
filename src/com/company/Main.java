package com.company;
public class Main {
    public static void main(String[] args) throws IncorrectSalaryException, FieldLengthLimitException {
        try {
            Employee employee = new Employee("Danil", "Moskvin", 2000);
            Employee employee2 = new Employee("Anton", "Voloshyn", -3000);
            employee.printInfo();
            employee2.printInfo();
        }catch (FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}