package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Artist_SongService {
	
 @Autowired
 private ArtistSongRepository artistSongRepository;
 
 @Autowired
 private SongRepository songRepository;
 
 @Autowired
 private ArtistRepository artistRepository;
	
	 public List<Artist_Song> retrieveTopSong() {
		    List<Artist_Song> topSongs = (List<Artist_Song>) artistSongRepository.findByRating();
			return topSongs;
		  }
	 public List<String> retrieveArtistName() {
		    List<String> artistName = (List<String>) artistSongRepository.findDistinctArtistName();
			return artistName;
		  }
	
	public void postAddSongDataAtService(Song song) {
		// TODO Auto-generated method stub
		songRepository.save(song);
	}
	public void postAddArtistDataAtService(Artist artist) {
		// TODO Auto-generated method stub
		artistRepository.save(artist);
	}
}
