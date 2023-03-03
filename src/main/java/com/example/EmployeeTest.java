package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

public class EmployeeTest {

    public static void main(String[] args) {
        EmployeeStockPlan esp = new EmployeeStockPlan();

        Engineer engineer = new Engineer(
                101,
                "Jane Smith",
                "012-34-5678",
                120_345.23
        );
        Manager manager = new Manager(
                207,
                "Barbara Johnson",
                "054-12-5678",
                109_230.12,
                "US Marketing"
        );
        Admin admin = new Admin(
                304,
                "Bill Monore",
                "108-23-6509",
                75_002.45
        );
        Director director = new Director(
                12,
                "Susan Wheeler",
                "099-12-2304",
                120_567.0,
                "Global Marketing",
                1_000_000.00
        );
        printEmployee(engineer);
        System.out.println();
        printEmployee(manager, esp);
    }


    public static void printEmployee(Employee emp){
        System.out.println("Employee type:   "+ emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee(emp);
        System.out.println("Stock options:  " + esp.grantStock(emp));
    }
}