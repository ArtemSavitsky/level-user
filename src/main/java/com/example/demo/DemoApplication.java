package com.example.demo;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;

public class DemoApplication {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(400));
        users.add(new User(1400));
        users.add(new User(2400));
        users.add(new User(3400));
        users.add(new User(5400));
        users.add(new User(6400));

        Function<User, Optional<Level>> salaryFunction = user -> Arrays.stream(Level.values())
                .filter(l -> l.getPredicate().test(user))
                .findFirst();

        Map<Optional<Level>, List<User>> map = users.stream()
                .collect(groupingBy(salaryFunction));

        System.out.println(map);
    }

}
