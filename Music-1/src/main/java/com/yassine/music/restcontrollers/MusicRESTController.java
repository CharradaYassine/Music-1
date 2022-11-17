package com.yassine.music.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yassine.music.service.MusicService;
import com.yassine.music.entities.Music;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MusicRESTController {
	@Autowired
	MusicService musicService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Music> getAllProduits() {
		return musicService.getAllMusics();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Music getMusicById(@PathVariable("id") Long id) {
		return musicService.getMusic(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Music createMusic(@RequestBody Music music) {
		return musicService.saveMusic(music);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Music updateMusic(@RequestBody Music music) {
		return musicService.updateMusic(music);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMusic(@PathVariable("id") Long id) {
		musicService.deleteMusicById(id);
	}

	@RequestMapping(value = "/MusicGenre/{idGen}", method = RequestMethod.GET)
	public List<Music> getMusicsByGenId(@PathVariable("idGen") Long idGen) {
		return musicService.findByGenreIdGen(idGen);
	}

}
