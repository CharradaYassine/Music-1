package com.yassine.music.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor()
@Entity
public class Music {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idMusic;
	private String nomMusic;
	private Double prixMusic;
	private Float duree;
	private Date dateSortie;
	@ManyToOne
	private Genre genre;
	public Music(String nomMusic, Double prixMusic, Float duree, Date dateSortie) {
		super();
		this.nomMusic = nomMusic;
		this.prixMusic = prixMusic;
		this.duree = duree;
		this.dateSortie = dateSortie;
	}
	
}