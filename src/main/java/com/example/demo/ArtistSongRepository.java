package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ArtistSongRepository extends CrudRepository<Artist_Song,Long> {
	
@Query(value="select * from artist_song order by rating desc limit 10",nativeQuery=true)
List<Artist_Song>findByRating();
	
@Query(value="select distinct artistName from artist_song",nativeQuery=true)
List<String>findDistinctArtistName();
}
