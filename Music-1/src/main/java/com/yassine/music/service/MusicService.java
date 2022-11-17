package com.yassine.music.service;

import java.util.List;
import com.yassine.music.entities.Genre;
import com.yassine.music.entities.Music;

public interface MusicService {
	Music saveMusic(Music m);
	Music updateMusic(Music m);
	void deleteMusic(Music m);
	void deleteMusicById(Long id);
	Music getMusic(Long id);
	List<Music> getAllMusics();
	List<Music> findByNomMusic(String nom);
	List<Music> findByNomMusicContains(String nom);

	List<Music> findByNomDuree(String nom, Float duree);
	
	List<Music> findByGenre(Genre Genre);

	List<Music> findByGenreIdGen(Long id);
	List<Music> findByOrderByNomMusicAsc();

	List<Music> trierMusicsNomsDuree();
}
