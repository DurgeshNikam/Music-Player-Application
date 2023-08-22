package com.musicplayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicplayer.Repositary.SongRepository;
import com.musicplayer.entity.Song;

@Service
public class SongServiceImpl implements SongService {

	@Autowired(required = true)
    private SongRepository songRepository;

    public List<Song> getSongsByGenre(String genre) {
        return songRepository.findByGenre(genre);
    }

	@Override
	public List<Song> getSongsByid(Long id) {
		// TODO Auto-generated method stub
		return songRepository.findAllById(id);
	}

	@Override
	public List<Song> getSongsBytitle(String title) {
		// TODO Auto-generated method stub
		return songRepository.findBytitle(title);
	}

	@Override
	public List<Song> getSongsByartist(String artist) {
		// TODO Auto-generated method stub
		return songRepository.findByartist(artist);
	}

	@Override
	public List<Song> getSongsByalbum(String album) {
		// TODO Auto-generated method stub
		return songRepository.findByalbum(album);
	}

	@Override
	public List<Song> getSongsByyear(int year) {
		// TODO Auto-generated method stub
		return songRepository.findByyear(year);
	}

	@Override
	public Song addsong(Song song) {
		// TODO Auto-generated method stub
		System.out.println("Data Come Hear");
		
		Song save = songRepository.save(song);
		return save;
	}

	@Override
	public Song updatesong(Song song) {
		// TODO Auto-generated method stub
		return songRepository.saveSong(song);
	}

	@Override
	public List<Song> deletesong(Song song) {
		// TODO Auto-generated method stub
		return null;
	}
}
