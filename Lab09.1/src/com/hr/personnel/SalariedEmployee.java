package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee
        extends Employee
        implements TaxPayer {

    //properties/fields
    private double salary;

    //constructors
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); //delegate to superclass ctor which handles name, hireDate
        //register401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);  // delegate to superclass ctor, which handles name, hireDate
        setSalary(salary);
    }
//
    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

//    action methods
    @Override
    public void pay() {
        System.out.printf(getName() + " is paid salary of $%.2f\n", getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    @Override
    public void payTaxes() {
        System.out.printf("%s paid salary taxes of %s\n", getName(), taxes);
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " salary: %.2f\n", salary);
    }
}