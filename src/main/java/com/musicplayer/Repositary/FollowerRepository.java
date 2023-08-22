package com.musicplayer.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicplayer.entity.Follower;
import com.musicplayer.entity.User;
@Repository
public interface FollowerRepository extends JpaRepository<Follower, Long> {
    List<Follower> findByFollower(User follower);
    List<Follower> findByFollowing(User following);
	Follower findByFollowerAndFollowing(User follower, User unfollowing);

}
