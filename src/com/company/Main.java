package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> UsersList = new ArrayList<>();

        createNewUsers(UsersList);

        UserDao userDao = new UserDao(UsersList);
        UserService UsersService = new UserService(userDao);

        UsersService.addUser(new User(4, "Roman", 26, "male"));

        System.out.println(UsersService.getAllUsers());
        System.out.println(UsersService.findUserById(4).getName());
        System.out.println(UsersService.deleteUserById(4));

    }


    public static void createNewUsers(List<User> mUsersList) {

        User userOne = new User(1, "David", 23, "male");
        User userTwo = new User(2, "Adam", 24, "male");
        User userThree = new User(3, "Henry", 25, "male");
        mUsersList.add(userOne);
        mUsersList.add(userTwo);
        mUsersList.add(userThree);
    }

}
