package com.springboot.springsecurityjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetailsServices implements UserDetailsService {

    @Autowired
    UserRepo userRepo;



    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Optional<User>user  = userRepo.findByUserName(userName);
        
        user.orElseThrow(()-> new UsernameNotFoundException("Not Found"+ userName));
        
        return user.map(MyUserDetails::new).get();
    }



    
    
}
