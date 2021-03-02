package org.geektimes.projects.user.service.impl;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.sql.DBConnectionManager;
import org.geektimes.projects.user.sql.DBSource;


public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    /**
     * 初始化db connection
     */
    public UserServiceImpl(){
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        dbConnectionManager.setConnection(DBSource.getInstance().getConnection());
        userRepository = new DatabaseUserRepository(dbConnectionManager);
    }


    @Override
    public boolean register(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}
