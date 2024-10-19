package com.CODE;
class Employee02{
    private  int Salary;
    private String Name;


    public Employee02(){
        Salary= 5000;
        Name = "Enter-Your-Name";
    }
//    public Employee02(int salary, String name) {
//        Salary = salary;
//        Name = name;
//    }



    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }
}

public class Constractor {
    public static void main(String[] args) {
        Employee02 Emp = new Employee02();
//         Emp.setName("Ashish");
//        Emp.setName("Ashish");

        System.out.println(Emp.getName());
        System.out.println(Emp.getSalary());

    }
}
