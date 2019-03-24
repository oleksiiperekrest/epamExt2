package com.company.lesson3.ui;

import com.company.lesson3.entity.User;
import com.company.lesson3.service.UserService;

import java.util.Scanner;

public class ConsoleUi {

    private UserService userService;
    private Scanner scanner;

    public ConsoleUi(UserService userService) {
        this.userService = userService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean isLogin = false;
        String email = null;
        while (!isLogin) {

            System.out.println("Please input your Email and Password");
            System.out.println("email:");
            email = scanner.next();
            System.out.println("password");
            String password = scanner.next();

            isLogin = userService.login(email, password);
        }

        User user = userService.findUserByEmail(email);

        System.out.println(user);

    }
}
