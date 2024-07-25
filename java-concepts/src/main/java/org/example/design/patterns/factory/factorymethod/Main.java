package org.example.design.patterns.factory.factorymethod;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new MySQLDatabase());
        userService.createUser();
    }
}
