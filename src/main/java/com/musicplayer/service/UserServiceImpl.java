package com.musicplayer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayer.Repositary.UserRepository;
import com.musicplayer.entity.User;

@Service
public class UserServiceImpl {

	@Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        
        userRepository.deleteById(userId);
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
