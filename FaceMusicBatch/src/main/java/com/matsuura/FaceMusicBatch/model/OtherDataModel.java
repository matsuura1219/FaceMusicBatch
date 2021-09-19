package com.matsuura.FaceMusicBatch.model;

public class OtherDataModel {

	/** 変数 **/

	// 楽曲ID
	private String id;
	// 曲名
	private String track;
	// アーティスト名
	private String artist;
	// imageURL
	private String url;
	// release_day
	private String releaseDay;


	/** Getter / Setter **/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getReleaseDay() {
		return releaseDay;
	}

	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}


}
