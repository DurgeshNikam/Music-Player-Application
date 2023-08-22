package com.musicplayer.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicplayer.entity.Album;
@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Album> findByGenre(String genre);

}
