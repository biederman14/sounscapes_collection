package org.wecancodeit.soundscapes_collection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String duration;
	@JsonIgnore
	@ManyToOne
	private Album albums;

	public Song() {

	}

	public Song(String title, String duration, Album albums) {

		this.title = title;
		this.duration = duration;
		this.albums = albums;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDuration() {
		return duration;
	}

	public Album getAlbum() {
		return albums;
	}

}
