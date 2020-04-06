package com.example.demo;




import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Entity class
@Entity
@Table(name="artist_song")
public class Artist_Song {

	@Id
	@Column(name="id", nullable = false, unique = true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(name="artistname",nullable = false, unique = true)
    private String artistName;
	
	@Column(name="dob",nullable = false, unique = true)
    @Temporal(TemporalType.DATE)
    private Date dob;
	
	@Column(name="songname",nullable = false, unique = true)
    private String songName;
	
	@Lob
	@Column(name = "cover", columnDefinition="BLOB",nullable = false, unique = true)
    private byte[] cover;
	
	@Column(name="dor",nullable = false, unique = true)
    @Temporal(TemporalType.DATE)
    private Date dor;
    
	@Column(name="rating",nullable = false, unique = true)
    private Long rating;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getArtistName() {
		return artistName;
	}


	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public byte[] getCover() {
		return cover;
	}


	public void setCover(byte[] cover) {
		this.cover = cover;
	}


	public Date getDor() {
		return dor;
	}


	public void setDor(Date dor) {
		this.dor = dor;
	}


	public Long getRating() {
		return rating;
	}


	public void setRating(Long rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Artist_Song [id=" + id + ", artistName=" + artistName + ", dob=" + dob + ", songName=" + songName
				+ ", cover=" + Arrays.toString(cover) + ", dor=" + dor + ", rating=" + rating + "]";
	}


	public Artist_Song(Long id, String artistName, Date dob, String songName, byte[] cover, Date dor, Long rating) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.dob = dob;
		this.songName = songName;
		this.cover = cover;
		this.dor = dor;
		this.rating = rating;
	}


	public Artist_Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
  }