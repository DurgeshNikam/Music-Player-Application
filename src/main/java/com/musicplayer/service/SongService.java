package com.musicplayer.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.musicplayer.entity.Song;

@Service
public interface SongService {

	
	
	public Song addsong(Song song);
	
	
	public List<Song> getSongsByGenre(String genre);

	public List<Song> getSongsByid(Long id);

	public List<Song> getSongsBytitle(String title);

	public List<Song> getSongsByartist(String artist);

	public List<Song> getSongsByalbum(String album);
	

	public List<Song> getSongsByyear(int year);



	public List<Song> updatesong(Song song);

	public List<Song> deletesong(Song song);

	

}
