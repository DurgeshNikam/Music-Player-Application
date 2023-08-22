package com.musicplayer.controllers;

import java.util.List;

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

import com.musicplayer.entity.Playlist;
import com.musicplayer.entity.User;
import com.musicplayer.service.PlaylistService;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {
	@Autowired
    private PlaylistService playlistService;

    @PostMapping
    public Playlist createPlaylist(@RequestBody Playlist playlist) {
        return playlistService.createPlaylist(playlist);
    }

    @PutMapping("/{playlistId}")
    public Playlist updatePlaylist(@PathVariable Long playlistId, @RequestBody Playlist playlist) {
        playlist.setId(playlistId);
        return playlistService.updatePlaylist(playlist);
    }

    @DeleteMapping("/{playlistId}")
    public void deletePlaylist(@PathVariable Long playlistId) {
        playlistService.deletePlaylist(playlistId);
    }

    @GetMapping("/user/{userId}")
    public List<Playlist> getUserPlaylists(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        return playlistService.getUserPlaylists(user);
    }
}
