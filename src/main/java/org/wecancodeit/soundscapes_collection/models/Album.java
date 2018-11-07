package org.wecancodeit.soundscapes_collection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Album {

	@Id
	@GeneratedValue

	private Long id;
	private String albumTitle;
	private String albumImage;
	private String recordLabel;

	public Album() {
	}

	public Album(String albumTitle, String albumImage, String recordLabel) {
		super();
		this.albumTitle = albumTitle;
		this.albumImage = albumImage;
		this.recordLabel = recordLabel;
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
