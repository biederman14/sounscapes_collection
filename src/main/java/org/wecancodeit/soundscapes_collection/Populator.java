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

	private Album createAlbum(String albumTitle, String albumImage, String recordLabel, Artist artist) {
		Album b = new Album(albumTitle, albumImage, recordLabel, artist);
		return albumRepo.save(b);
	}

	private Song createSong(String title, String duration, Album albums) {
		Song c = new Song(title, duration, albums);
		return songRepo.save(c);
	}

	@Override
	public void run(String... args) throws Exception {

		Artist philCollins = createArtist("Phil Collins", "/phil.jpg", "Chiswick, London, UK");
		Artist milesDavis = createArtist("Miles Davis", "/miles.jpg", "Alton, IL");
		Artist chicago = createArtist("Chicago", "/chicago.jpg", "Chicago, IL");

		Album invisibleTouch = createAlbum("Invisible Touch", "/itouch.jpg", "Atlantic Records", philCollins);
		Album noJacketRequired = createAlbum("No Jacket Required", "/noJacket.png", "Virgin Records", philCollins);
		Album kindOfBlue = createAlbum("Kind of Blue", "/kindofBlue.jpg", "Columbia Records", milesDavis);
		Album sorcerer = createAlbum("Sorcerer", "/sorcerer.jpg", "Columbia Records", milesDavis);
		Album chicago17 = createAlbum("17", "/17.jpg", "Warner Bros.", chicago);
		Album chicago19 = createAlbum("19", "/19.jpg", "Reprise", chicago);

		Song tonightTonightTonight = createSong("Tonight, Tonight, Tonight", "8:47", invisibleTouch);
		Song theLastDomino = createSong("The Last Domino", "11:11", invisibleTouch);
		Song sussudio = createSong("Sussudio", "4:23", noJacketRequired);
		Song takeMeHome = createSong("Take Me Home", "5:52", noJacketRequired);
		Song soWhat = createSong("So What", "4:05", kindOfBlue);
		Song freddieFreeloader = createSong("Freddie Freeloader", "3:52", kindOfBlue);
		Song limbo = createSong("Limbo", "4:00", sorcerer);
		Song peeWee = createSong("PeeWee", "4:05", sorcerer);
		Song youreTheInspiration = createSong("You're The Inspiration", "3:50", chicago17);
		Song hardHabitToBreak = createSong("Hard Habit to Break", "4:44", chicago17);
		Song lookAway = createSong("Look Away", "3:55", chicago19);
		Song youreNotAlone = createSong("You're Not Alone", "4:00", chicago19);

	}

}
