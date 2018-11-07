package org.wecancodeit.soundscapes_collection;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.soundscapes_collection.models.Album;
import org.wecancodeit.soundscapes_collection.models.Artist;
import org.wecancodeit.soundscapes_collection.models.Song;
import org.wecancodeit.soundscapes_collection.repository.AlbumRepository;
import org.wecancodeit.soundscapes_collection.repository.ArtistRepository;
import org.wecancodeit.soundscapes_collection.repository.SongRepository;

@Service
public class Populator implements CommandLineRunner {

	@Resource
	ArtistRepository artistRepo;

	@Resource
	AlbumRepository albumRepo;

	@Resource
	SongRepository songRepo;

	private Artist createArtist(String artistName, String artistImage, String artistHometown) {

		Artist a = new Artist(artistName, artistImage, artistHometown);
		return artistRepo.save(a);
	}

	private Album createAlbum(String albumTitle, String albumImage, String recordLabel, Artist artist,
			Collection<Song>... songs) {
		Album b = new Album(albumTitle, albumImage, recordLabel, artist, songs);
		return albumRepo.save(b);
	}

	@Override
	public void run(String... args) throws Exception {

		Artist philCollins = createArtist("Phil Collins", "/phil.jpg", "Chiswick, London, UK");
		Artist milesDavis = createArtist("Miles Davis", "/miles.jpg", "Alton, IL");
		Artist chicago = createArtist("Chicago", "/chicago.jpg", "Chicago, IL");

		Album invisibleTouch = createAlbum("Invisible Touch", "/itouch.jpg", "Atlantic Records");
		Album noJacketRequired = createAlbum("No Jacket Required", "/noJacket.png", "Virgin Records");
		Album kindOfBlue = createAlbum("Kind of Blue", "/kindofBlue.jpg", "Columbia Records");
		Album sorcerer = createAlbum("Sorcerer", "/sorcerer.jpg", "Columbia Records");
		Album chicago17 = createAlbum("17", "/17.jpg", "Warner Bros.");
		Album chicago19 = createAlbum("19", "/19.jpg", "Reprise");
	}

}
