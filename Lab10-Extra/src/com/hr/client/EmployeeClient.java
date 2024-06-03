package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;


import javax.print.attribute.standard.Destination;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee emp = new Employee("Katie");

        // TODO: call goToWork() on the Employee object
        try {
            emp.goToWork();
        }
        catch (WorkException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause()); //extracts the nested 'cause'
            System.out.println();
            e.printStackTrace();
        }
    }
}