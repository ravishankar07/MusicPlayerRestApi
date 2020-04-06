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

@Entity
@Table(name="songs")
public class Song {

	@Id
	@Column(name="songId", nullable = false, unique = true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long songId;
	
	@Column(name="dor",nullable = false, unique = true)
    @Temporal(TemporalType.DATE)
    private Date dor;
	
	@Column(name="artistName",nullable = false, unique = true)
    private String artistName;
	
	@Lob
	@Column(name = "cover", columnDefinition="BLOB",nullable = false, unique = true)
    private byte[] cover;
	
	
	@Column(name="songname",nullable = false, unique = true)
    private String songName;
	
    
	@Column(name="rating",nullable = false, unique = true)
    private Long rating;


	public Long getSongId() {
		return songId;
	}


	public void setSongId(Long songId) {
		this.songId = songId;
	}


	public Date getDor() {
		return dor;
	}


	public void setDor(Date dor) {
		this.dor = dor;
	}


	public String getArtistName() {
		return artistName;
	}


	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}


	public byte[] getCover() {
		return cover;
	}


	public void setCover(byte[] cover) {
		this.cover = cover;
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public Long getRating() {
		return rating;
	}


	public void setRating(Long rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Song [songId=" + songId + ", dor=" + dor + ", artistName=" + artistName + ", cover="
				+ Arrays.toString(cover) + ", songName=" + songName + ", rating=" + rating + "]";
	}


	public Song(Long songId, Date dor, String artistName, byte[] cover, String songName, Long rating) {
		super();
		this.songId = songId;
		this.dor = dor;
		this.artistName = artistName;
		this.cover = cover;
		this.songName = songName;
		this.rating = rating;
	}


	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
