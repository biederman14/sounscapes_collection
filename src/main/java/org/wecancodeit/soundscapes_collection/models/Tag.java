package org.wecancodeit.soundscapes_collection.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String tagName;

	@JsonIgnore
	@ManyToMany
	private Collection<Song> songs = new HashSet<Song>();

	public Tag() {
	}

	public Tag(String tagName) {
		this.tagName = tagName;
	}

	public void addSong(Song song) {
		songs.add(song);
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	public Collection<Song> getSongs() {
		return songs;
	}

}
