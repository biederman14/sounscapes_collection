package org.wecancodeit.soundscapes_collection.models;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Album {

	@Id
	@GeneratedValue

	private Long id;
	private String albumTitle;
	private String albumImage;
	private String recordLabel;

	@ManyToOne
	private Artist artist;

	@OneToMany(mappedBy = "album")
	private Collection<Song> songs;

	public Album() {
	}

	public Album(String albumTitle, String albumImage, String recordLabel, Artist artist, Collection<Song> songs) {
		this.albumTitle = albumTitle;
		this.albumImage = albumImage;
		this.recordLabel = recordLabel;
		this.artist = artist;
		this.songs = songs;
	}

	public Artist getArtist() {
		return artist;
	}

	public Collection<Song> getSongs() {
		return songs;
	}

	public Long getId() {
		return id;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getAlbumImage() {
		return albumImage;
	}

	public String getRecordLabel() {
		return recordLabel;
	}
}
