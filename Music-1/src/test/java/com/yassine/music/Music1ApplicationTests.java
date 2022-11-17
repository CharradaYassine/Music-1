package com.yassine.music;

import java.util.Date;


import java.util.List;

import org.hibernate.Hibernate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import org.springframework.transaction.annotation.Transactional;
import com.yassine.music.entities.Genre;
//import com.yassine.music.entities.Genre;
import com.yassine.music.entities.Music;
import com.yassine.music.repos.MusicRepository;

@SpringBootTest
class Music1ApplicationTests {
	@Autowired
	private MusicRepository musicRepository;
	
	@Test
	public void testCreateMusic() {
		Music M = new Music("Hotel California 2", 1.5, 2.3f, new Date());
		musicRepository.save(M);
	}

	@Test
	public void testFindMusic() {
		Music M = musicRepository.findById(1L).get();
		System.out.println(M);
	}

	@Test
	public void testUpdateMusic() {
		Music M = musicRepository.findById(1L).get();
		M.setDuree(6.4f);
		musicRepository.save(M);
	}

	@Test
	public void testDeleteMusic() {
		musicRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousMusic() {
		List<Music> Ms = musicRepository.findAll();
		for (Music m : Ms) {
			System.out.println(m);
		}
	}

	@Test
	public void testFindByNomMusic() {
		List<Music> ms = musicRepository.findByNomMusic("Hello");
		for (Music m : ms) {
			System.out.println(m);
		}
	}

	@Test
	public void testFindByNomMusicContains() {
		List<Music> ms = musicRepository.findByNomMusicContains("H");
		for (Music m : ms) {
			System.out.println(m);
		}
	}

	@Test
	public void testfindByNomDuree() {
		List<Music> ms = musicRepository.findByNomDuree("Hello", 3.3f);
		for (Music m : ms) {
			System.out.println(m);
		}
	}
	@Test
	public void testfindByGenre() {
		Genre gen = new Genre();
		gen.setIdGen(2L);
		List<Music> ms = musicRepository.findByGenre(gen);
		for (Music m : ms) {
			System.out.println(m);
		}
	}
	@Test
	public void findByGenreIdGenre() {
		Hibernate.initialize(musicRepository);
		List<Music> ms = musicRepository.findByGenreIdGen(1L);
		
		for (Music m : ms) {
			System.out.println(m);
		}
	}
	@Test
	public void testfindByOrderByNomMusicAsc() {
		List<Music> ms = musicRepository.findByOrderByNomMusicAsc();
		for (Music m : ms) {
			System.out.println(m);
		}
	}

	@Test
	public void testTrierMusicNomsDuree() {
		List<Music> ms = musicRepository.trierMusicNomsDuree();
		for (Music m : ms) {
			System.out.println(m);
		}
	}

}
