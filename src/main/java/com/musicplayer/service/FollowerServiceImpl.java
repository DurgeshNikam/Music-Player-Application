package com.musicplayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayer.Repositary.FollowerRepository;
import com.musicplayer.Repositary.UserRepository;
import com.musicplayer.entity.Follower;
import com.musicplayer.entity.User;

@Service
public class FollowerServiceImpl {

	  @Autowired
	    private FollowerRepository followerRepository;
	  @Autowired
	  private UserRepository userRepository;

	    public Follower followUser(User follower, User following) {
	        // Add logic to create a follower relationship
	        Follower followerRelationship = new Follower();
	        followerRelationship.setFollower(follower);
	        followerRelationship.setFollowing(following);
	        return followerRepository.save(followerRelationship);
	    }

	    public List<Follower> getFollowers(User user) {
	        return followerRepository.findByFollowing(user);
	    }
	    public void followUser(Long followerId, Long followingId) {
	        User follower = userRepository.findById(followerId).orElse(null);
	        User following = userRepository.findById(followingId).orElse(null);
	        
	        if (follower != null && following != null) {
	            Follower followerRelationship = new Follower();
	            followerRelationship.setFollower(follower);
	            followerRelationship.setFollowing(following);
	            followerRepository.save(followerRelationship);
	        }
	    }

	    public void unfollowUser(Long followerId, Long unfollowingId) {
	        User follower = userRepository.findById(followerId).orElse(null);
	        User unfollowing = userRepository.findById(unfollowingId).orElse(null);
	        
	        if (follower != null && unfollowing != null) {
	            Follower followerRelationship = followerRepository.findByFollowerAndFollowing(follower, unfollowing);
	            if (followerRelationship != null) {
	                followerRepository.delete(followerRelationship);
	            }
	        }
	    }
}
