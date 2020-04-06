package com.example.demo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="artist")
public class Artist {

	@Id
	@Column(name="id", nullable = false, unique = true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(name="dob",nullable = false, unique = true)
    @Temporal(TemporalType.DATE)
    private Date dob;
	
	@Column(name="bio",nullable = false, unique = true)
    private String bio;
	
	@Column(name="songId", nullable = false, unique = true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long songId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Long getSongId() {
		return songId;
	}

	public void setSongId(Long songId) {
		this.songId = songId;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", dob=" + dob + ", bio=" + bio + ", songId=" + songId + "]";
	}

	public Artist(Long id, Date dob, String bio, Long songId) {
		super();
		this.id = id;
		this.dob = dob;
		this.bio = bio;
		this.songId = songId;
	}

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
