package com.maryanto.dimas.services;

import com.maryanto.dimas.model.User;
import com.maryanto.dimas.model.UserPrincipal;
import com.maryanto.dimas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if (user != null) return new UserPrincipal(user);
        else return new UserPrincipal(new User());
    }
}
