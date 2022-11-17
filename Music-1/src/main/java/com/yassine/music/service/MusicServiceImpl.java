package com.yassine.music.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.music.entities.Genre;
import com.yassine.music.entities.Music;
import com.yassine.music.repos.MusicRepository;

@Service
public class MusicServiceImpl implements MusicService {
	@Autowired
	MusicRepository musicRepository;

	@Override
	public Music saveMusic(Music m) {
		return musicRepository.save(m);
	}

	@Override
	public Music updateMusic(Music m) {
		return musicRepository.save(m);
	}

	@Override
	public void deleteMusic(Music m) {
		musicRepository.delete(m);
	}

	@Override
	public void deleteMusicById(Long id) {
		musicRepository.deleteById(id);
	}

	@Override
	public Music getMusic(Long id) {
		return musicRepository.findById(id).get();
	}

	@Override
	public List<Music> getAllMusics() {
		return musicRepository.findAll();
	}

	@Override
	public List<Music> findByNomMusic(String nom) {
		return musicRepository.findByNomMusic(nom);
	}

	@Override
	public List<Music> findByNomMusicContains(String nom) {
		return musicRepository.findByNomMusicContains(nom);
	}

	@Override
	public List<Music> findByNomDuree(String nom, Float duree) {
		return musicRepository.findByNomDuree(nom, duree);
	}

	@Override
	public List<Music> findByGenre(Genre genre) {
		return musicRepository.findByGenre(genre);
	}

	@Override
	public List<Music> findByGenreIdGen(Long id) {
		return musicRepository.findByGenreIdGen(id);
	}
	@Override
	public List<Music> findByOrderByNomMusicAsc() {
		return musicRepository.findByOrderByNomMusicAsc();
	}

	@Override
	public List<Music> trierMusicsNomsDuree() {
		return musicRepository.trierMusicNomsDuree();
	}
}
