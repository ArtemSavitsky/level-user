package com.example.demo;

import java.util.function.Predicate;

public enum  Level {

    JUNIOR(p -> p.getSalary() > 0 && p.getSalary() <= 1000),
    MIDDLE(p -> p.getSalary() > 1001 && p.getSalary() <= 2000),
    SENIOR(p -> p.getSalary() > 2001 && p.getSalary() <= 3000);

    private final Predicate<User> predicate;

    Level(Predicate <User> predicate) {
        this.predicate = predicate;
    }

    public Predicate<User> getPredicate() {
        return predicate;
    }
}
