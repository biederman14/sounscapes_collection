package org.wecancodeit.soundscapes_collection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artist {

	@Id
	@GeneratedValue
	private Long id;
	private String artistName;
	private String artistImage;
	private String artistHometown;
	private String artistRecordLabel;

	public Artist() {
	}

	public Artist(String artistName, String artistImage, String artistHometown, String artistRecordLabel) {
		this.artistName = artistName;
		this.artistImage = artistImage;
		this.artistHometown = artistHometown;
		this.artistRecordLabel = artistRecordLabel;
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

	public String getArtistRecordLabel() {
		return artistRecordLabel;
	}

}
