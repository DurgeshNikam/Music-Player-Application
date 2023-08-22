package com.musicplayer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musicplayer.entity.Song;
import com.musicplayer.service.SongService;

@RestController
@RequestMapping("/api/songs")
public class SongController {

	     @Autowired
	    private SongService songService;

	 
	 @PostMapping
	    public Song addSongs(@RequestBody Song song) {
	        return songService.addsong(song);
	    }
	 @PutMapping
	    public List<Song> updateSongs(@RequestBody Song song) {
	        return songService.updatesong(song);
	    }
	 @DeleteMapping
	    public List<Song> deleteSongs(@RequestBody Song song) {
	        return songService.deletesong(song);
	    }
	    @GetMapping
	    public List<Song> getSongsByid(@RequestParam Long id) {
	        return songService.getSongsByid(id);
	    }
	    @GetMapping
	    public List<Song> getSongsBytitle(@RequestParam String title) {
	        return songService.getSongsBytitle(title);
	    }
	    @GetMapping
	    public List<Song> getSongsByartist(@RequestParam String artist) {
	        return songService.getSongsByartist(artist);
	    }
	    @GetMapping
	    public List<Song> getSongsByalbum(@RequestParam String album) {
	        return songService.getSongsByalbum(album);
	    }
	    @GetMapping
	    public List<Song> getSongsByyear(@RequestParam int year) {
	        return songService.getSongsByyear(year);
	    }
	    @GetMapping
	    public List<Song> getSongsByGenre(@RequestParam String genre) {
	        return songService.getSongsByGenre(genre);
	    }
	    @PostMapping("/{songId}/like")
	    public ResponseEntity<String> likeSong(@PathVariable Long songId) {
	        // Implement logic to like song
	        // Call songLikeService.likeSong(userId, songId);
	        return ResponseEntity.ok("Song liked successfully.");
	    }

	    @PostMapping("/{songId}/unlike")
	    public ResponseEntity<String> unlikeSong(@PathVariable Long songId) {
	        // Implement logic to unlike song
	        // Call songLikeService.unlikeSong(userId, songId);
	        return ResponseEntity.ok("Song unliked successfully.");
	    }
}
