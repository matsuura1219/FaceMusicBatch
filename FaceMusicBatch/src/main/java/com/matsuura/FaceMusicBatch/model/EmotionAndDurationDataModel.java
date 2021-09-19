package com.matsuura.FaceMusicBatch.model;

public class EmotionAndDurationDataModel {

	/** 変数 **/

	// 楽曲ID
	private String id;
	// danceablitity
	private double danceability;
	// energy
	private double energy;
	// loudness
	private double loudness;
	// speechiness
	private double speechiness;
	// acousticness
	private double acousticness;
	// instrumentalness
	private double instrumentalness;
	/// liveness
	private double liveness;
	// valence
	private double valence;
	// tempo
	private double tempo;
	// duration_time
	private int durationTime;

	/** Getter / Setter **/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getDanceability() {
		return danceability;
	}

	public void setDanceability(double danceability) {
		this.danceability = danceability;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public double getLoudness() {
		return loudness;
	}

	public void setLoudness(double loudness) {
		this.loudness = loudness;
	}

	public double getSpeechiness() {
		return speechiness;
	}

	public void setSpeechiness(double speechiness) {
		this.speechiness = speechiness;
	}

	public double getAcousticness() {
		return acousticness;
	}

	public void setAcousticness(double acousticness) {
		this.acousticness = acousticness;
	}

	public double getInstrumentalness() {
		return instrumentalness;
	}

	public void setInstrumentalness(double instrumentalness) {
		this.instrumentalness = instrumentalness;
	}

	public double getLiveness() {
		return liveness;
	}

	public void setLiveness(double liveness) {
		this.liveness = liveness;
	}

	public double getValence() {
		return valence;
	}

	public void setValence(double valence) {
		this.valence = valence;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public int getDurationTime() {
		return durationTime;
	}

	public void setDurationTime(int durationTime) {
		this.durationTime = durationTime;
	}


}
