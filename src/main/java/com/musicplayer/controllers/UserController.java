package com.musicplayer.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musicplayer.entity.User;
import com.musicplayer.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
        user.setId(userId);
        return userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        Optional<User> user = userService.getUserByUsername(username);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/{userId}/follow/{followingId}")
    public ResponseEntity<String> followUser(
            @PathVariable Long userId,
            @PathVariable Long followingId) {
        // Implement logic to follow user
        // Call followerService.followUser(userId, followingId);
        return ResponseEntity.ok("User followed successfully.");
    }

    @PostMapping("/{userId}/unfollow/{unfollowingId}")
    public ResponseEntity<String> unfollowUser(
            @PathVariable Long userId,
            @PathVariable Long unfollowingId) {
        // Implement logic to unfollow user
        // Call followerService.unfollowUser(userId, unfollowingId);
        return ResponseEntity.ok("User unfollowed successfully.");
    }
}
