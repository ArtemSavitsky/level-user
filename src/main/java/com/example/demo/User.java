package com.example.demo;

public class User {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public User(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "salary=" + salary +
                '}';
    }
}
