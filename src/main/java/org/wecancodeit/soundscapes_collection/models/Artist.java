package org.wecancodeit.soundscapes_collection.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {

	@Id
	@GeneratedValue
	private Long id;
	private String artistName;
	private String artistImage;
	private String artistHometown;

	@OneToMany
	private Collection<Album> albums;

	public Artist() {
	}

	public Artist(String artistName, String artistImage, String artistHometown) {
		this.artistName = artistName;
		this.artistImage = artistImage;
		this.artistHometown = artistHometown;
	}

	public Long getId() {
		return id;
	}

	public String getArtistName() {
		return artistName;
	}

	public String getArtistImage() {
		return artistImage;
	}

	public String getArtistHometown() {
		return artistHometown;
	}

	public Collection<Album> getAlbums() {
		return albums;
	}

}
