package com.yassine.music.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomM", types = { Music.class })
public interface MusicProjection {
	public String getNomMusic();
}
