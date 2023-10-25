package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
            userService.createUsersTable();
            userService.saveUser("Amber", "AMB", (byte) 15);
            userService.saveUser("Anna", "ANN", (byte) 34);
            userService.saveUser("Eliza", "ALI", (byte) 45);
            userService.saveUser("Katie", "KAT", (byte) 56);
            userService.removeUserById(3);
            userService.getAllUsers();
            userService.cleanUsersTable();
            userService.dropUsersTable();

    }
}