package com.musicplayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayer.Repositary.PlaylistRepository;
import com.musicplayer.entity.Playlist;
import com.musicplayer.entity.User;

@Service
public class PlaylistServiceImpl {

	 @Autowired
	    private PlaylistRepository playlistRepository;

	    public Playlist createPlaylist(Playlist playlist) {
	        // Add logic to create a playlist
	        return playlistRepository.save(playlist);
	    }

	    public Playlist updatePlaylist(Playlist playlist) {
	        // Add logic to update a playlist
	        return playlistRepository.save(playlist);
	    }

	    public void deletePlaylist(Long playlistId) {
	        // Add logic to delete a playlist
	        playlistRepository.deleteById(playlistId);
	    }

	    public List<Playlist> getUserPlaylists(User user) {
	        return playlistRepository.findByUser(user);
	    }
}
