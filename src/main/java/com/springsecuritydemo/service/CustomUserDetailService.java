package com.springsecuritydemo.service;

import com.springsecuritydemo.dao.UserDao;
import com.springsecuritydemo.domain.User;
import com.springsecuritydemo.domain.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by diwakar on 15/07/17.
 */
public class CustomUserDetailService implements UserDetailsService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getUserByUserId(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user found with username " + username);
        }
        return new UserDetailsImpl(user);
    }
}
