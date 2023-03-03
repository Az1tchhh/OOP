package com.example.domain;

import java.util.ArrayList;

public class Manager extends Employee{
    private String deptName;
    private Employee[] staff;
    private int employeeCount = 0;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[20];
    }
    public int findEmployee(Employee obj){
        int i = 0;
        for (Employee employee : staff) {
            i++;
            if (obj == employee) {
                return i++;
            }

        }
        return -1;
    }

    public boolean addEmployee(Employee obj){
        for (Employee employee : staff){
            if(obj.equals(employee)) {

                return false;
            }
            if(employee == null){
                break;
            }
            employeeCount++;
        }
        staff[employeeCount] = obj;
        return true;
    }
    public boolean removeEmployee(Employee obj){
        boolean isRemoved = false;
        Employee[] temp = new Employee[20];
        int counter = 0;
        for (int i=0; i< staff.length; i++){
            if(obj != staff[i]){
                temp[counter++] = staff[i];
            }
            else{
                isRemoved = true;
            }
        }
        staff = temp;
        employeeCount = counter;
        return isRemoved;
    }

    public void printStaffDetails(){

        for (Employee employee : staff){
            if(employee == null){
                System.out.println();
                return;
            }
            System.out.print(employee.getName() + " ");
        }
        System.out.println();
    }
    public String getDeptName(){
        return deptName;
    }



    @Override
    public String toString(){
        return super.toString() + "\nDepartment:   " + getDeptName();
    }

}
