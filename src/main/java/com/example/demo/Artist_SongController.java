package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@Component
@RestController
public class Artist_SongController {
	//private static final Logger logger = LogManager.getLogger(Artist_SongController.class);	
	
	
@Autowired
private Artist_SongService artist_songservice;

@RequestMapping(value = "/topSongs")
public List<Artist_Song> findTopSongs() {
	
	List<Artist_Song> list=artist_songservice.retrieveTopSong();
	return list;
  
}
@RequestMapping(value = "/artistName")
public List<String> findArtistName() {
	
	List<String> listOfArtist=artist_songservice.retrieveArtistName();
	return listOfArtist;
  
}

@RequestMapping(value = "/postAddSongData", method = RequestMethod.POST)
public void postAddSongData(@RequestBody Song song ) {
	
	artist_songservice.postAddSongDataAtService(song);
  
}
@RequestMapping(value = "/postAddArtistData", method = RequestMethod.POST)
public void postAddArtistData(@RequestBody Artist artist ) {
	
	artist_songservice.postAddArtistDataAtService(artist);
  
}
}
