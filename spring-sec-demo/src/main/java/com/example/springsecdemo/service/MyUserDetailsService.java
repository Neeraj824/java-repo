package com.example.springsecdemo.service;

import com.example.springsecdemo.dao.UserRepo;
import com.example.springsecdemo.model.User;
import com.example.springsecdemo.model.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username"+username);
        User user = repo.findByUsername(username);
        System.out.println("user"+user);
        if(user == null){
            System.out.println("User 404");
            throw  new UsernameNotFoundException("User 404");
        }
        return new UserPrinciple(user);
    }
}
