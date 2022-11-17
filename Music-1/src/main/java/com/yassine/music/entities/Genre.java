package com.yassine.music.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Genre {
	public Genre(String nomGenre, String descGenre) {
		super();
		this.nomGenre = nomGenre;
		this.descGenre = descGenre;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGen;
	private String nomGenre;
	private String descGenre;
	@JsonIgnore
	@OneToMany(mappedBy="genre")
	private List<Music> musics;

}
