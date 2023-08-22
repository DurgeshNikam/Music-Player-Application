package com.musicplayer.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.musicplayer.entity.Song;


@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    List<Song> findByGenre(String genre);
    List<Song> findBytitle(String title);
    List<Song> findByartist(String artist);
    List<Song> findByalbum(String  album);
    List<Song> findByyear(int year);
	List<Song> findAllById(Long id);
	@Query
	Song saveSong(Song song);

}
