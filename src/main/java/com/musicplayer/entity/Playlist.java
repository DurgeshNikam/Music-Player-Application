package com.musicplayer.entity;

import java.util.*;

import javax.persistence.*;

@Entity
public class Playlist {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    @ManyToOne
	    private User user;
	    @ManyToMany
	    private List<Song> songs = new ArrayList<>();
	    @ManyToMany
	    private List<Album> albums = new ArrayList<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public List<Song> getSongs() {
			return songs;
		}

		public void setSongs(List<Song> songs) {
			this.songs = songs;
		}

		public List<Album> getAlbums() {
			return albums;
		}

		public void setAlbums(List<Album> albums) {
			this.albums = albums;
		}

		@Override
		public String toString() {
			return "Playlist [id=" + id + ", name=" + name + ", user=" + user + ", songs=" + songs + ", albums="
					+ albums + "]";
		}

		public Playlist(Long id, String name, User user, List<Song> songs, List<Album> albums) {
			super();
			this.id = id;
			this.name = name;
			this.user = user;
			this.songs = songs;
			this.albums = albums;
		}

		public Playlist() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
