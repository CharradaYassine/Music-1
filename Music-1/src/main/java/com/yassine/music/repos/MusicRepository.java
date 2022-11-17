package com.yassine.music.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.yassine.music.entities.Genre;
import com.yassine.music.entities.Music;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface MusicRepository extends JpaRepository  < Music, Long>{
	
	List<Music> findByNomMusic(String nom);
	List<Music> findByNomMusicContains(String nom);
	
	@Query("select m from Music m where m.nomMusic like %?1 and m.duree > ?2")
	List<Music> findByNomDuree (String nom, Float duree);
	@Query("select m from Music m where m.genre =	?1")
	List<Music> findByGenre (Genre genre);
	List<Music> findByGenreIdGen(Long id);
	
	List<Music> findByOrderByNomMusicAsc();	
	@Query("select m from Music m order by m.nomMusic DESC, m.duree ASC")
	List<Music> trierMusicNomsDuree ();
}
