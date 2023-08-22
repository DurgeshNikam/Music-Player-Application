package com.musicplayer.entity;

import javax.persistence.*;

@Entity
public class Follower {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User follower;
    @ManyToOne
    private User following;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getFollower() {
		return follower;
	}

	public void setFollower(User follower) {
		this.follower = follower;
	}

	public User getFollowing() {
		return following;
	}

	public void setFollowing(User following) {
		this.following = following;
	}

	@Override
	public String toString() {
		return "Follower [id=" + id + ", follower=" + follower + ", following=" + following + "]";
	}

	public Follower(Long id, User follower, User following) {
		super();
		this.id = id;
		this.follower = follower;
		this.following = following;
	}

	public Follower() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
