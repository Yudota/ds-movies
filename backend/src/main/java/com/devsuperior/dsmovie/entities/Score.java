package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePK idPk = new ScorePK();
	private Double value;
	
	public Score() {}

	public void setMovie(Movie movie) {
		idPk.setMovie(movie);
	}
	
	public void setUser(User user) {
		idPk.setUser(user);
	}
	
	public ScorePK getIdPk() {
		return idPk;
	}

	public void setIdPk(ScorePK idPk) {
		this.idPk = idPk;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
	
	
}
