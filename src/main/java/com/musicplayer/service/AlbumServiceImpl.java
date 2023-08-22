package com.musicplayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayer.Repositary.AlbumRepository;
import com.musicplayer.entity.Album;

@Service
public class AlbumServiceImpl {

	  @Autowired
	    private AlbumRepository albumRepository;

	    public List<Album> getAlbumsByGenre(String genre) {
	        return albumRepository.findByGenre(genre);
	    }
}
