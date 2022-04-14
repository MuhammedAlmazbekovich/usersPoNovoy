package com.company;

import java.util.List;

public class UserService {

    private UserDao mUserDao;

    public UserService(UserDao userDao) {
        this.mUserDao = userDao;
    }

    public void addUser(User user) {
        mUserDao.mUsers.add(user);
    }

    public Boolean deleteUserById(Integer id) {
        return mUserDao.mUsers.removeIf(mUser -> mUser.getId() == id);
    }

    public List<User> getAllUsers() {
        return mUserDao.mUsers;
    }

    public User findUserById(Integer id) {
        User user = new User();
        for (User mUser : mUserDao.mUsers) {
            if (mUser.getId() == id) {
                user = mUser;
            }
        }
        return user;
    }

}
