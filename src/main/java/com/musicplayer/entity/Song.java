package com.musicplayer.entity;

import javax.persistence.*;

@Entity
public class Song {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
        private String title;
	    private String artist;
	    private String album;
	    private int year;
	    private String genre;
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		@Override
		public String toString() {
			return "Song [id=" + id + ", title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year
					+ ", genre=" + genre + "]";
		}
		public Song(Long id, String title, String artist, String album, int year, String genre) {
			super();
			this.id = id;
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.year = year;
			this.genre = genre;
		}
		public Song() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
