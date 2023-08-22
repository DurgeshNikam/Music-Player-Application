package com.musicplayer.entity;

import javax.persistence.*;

@Entity
public class Album {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String artist;
	    private int year;
	    private String genre;
	 
	    public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	    
		public Album(Long id, String title, String artist, int year, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.genre = genre;
	}
		
		@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", artist=" + artist + ", year=" + year + ", genre=" + genre
				+ "]";
	}
		
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
		
}
