package com.musicplayer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musicplayer.entity.Album;
import com.musicplayer.service.AlbumService;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {
	 @Autowired
	    private AlbumService albumService;

	    @GetMapping
	    public List<Album> getAlbumsByGenre(@RequestParam String genre) {
	        return albumService.getAlbumsByGenre(genre);
	    }
}
