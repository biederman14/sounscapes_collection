package org.wecancodeit.soundscapes_collection;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.soundscapes_collection.models.Album;
import org.wecancodeit.soundscapes_collection.models.Artist;
import org.wecancodeit.soundscapes_collection.repository.AlbumRepository;
import org.wecancodeit.soundscapes_collection.repository.ArtistRepository;

@Service
public class Populator implements CommandLineRunner {

	@Resource
	ArtistRepository artistRepo;

	@Resource
	AlbumRepository albumRepo;

	private Artist createArtist(String artistName, String artistImage, String artistHometown) {

		Artist a = new Artist(artistName, artistImage, artistHometown);
		return artistRepo.save(a);
	}

	private Album createAlbum(String albumTitle, String albumImage, String recordLabel) {
		Album b = new Album(albumTitle, albumImage, recordLabel);
		return albumRepo.save(b);
	}

	@Override
	public void run(String... args) throws Exception {

		Artist philCollins = createArtist("Phil Collins", "/phil.jpg", "Chiswick, London, UK");
		Artist milesDavis = createArtist("Miles Davis", "/miles.jpg", "Alton, IL");
		Artist chicago = createArtist("Chicago", "/chicago.jpg", "Chicago, IL");

		Album invisibleTouch = createAlbum("Invisible Touch", "/iTouch.jpg", "Atlantic Records");
		Album noJacketRequired = createAlbum("No Jacket Required", "/noJacket.jpg", "Virgin Records");
		Album kindOfBlue = createAlbum("Kind of Blue", "/kOBlue.jpg", "Columbia Records");
		Album sorcerer = createAlbum("Sorcerer", "/sorcerer.jpg", "Columbia Records");
		Album chicago17 = createAlbum("17", "/17.jpg", "Warner Bros.");
		Album chicago19 = createAlbum("19", "/19.jpg", "Reprise");
	}

}
