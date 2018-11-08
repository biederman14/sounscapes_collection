package org.wecancodeit.soundscapes_collection.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.soundscapes_collection.models.Album;
import org.wecancodeit.soundscapes_collection.models.Artist;
import org.wecancodeit.soundscapes_collection.models.Song;
import org.wecancodeit.soundscapes_collection.repository.AlbumRepository;
import org.wecancodeit.soundscapes_collection.repository.ArtistRepository;
import org.wecancodeit.soundscapes_collection.repository.SongRepository;

@RestController
public class ApiController {

	@Autowired
	ArtistRepository artistRepo;

	@Autowired
	AlbumRepository albumRepo;

	@Autowired
	SongRepository songRepo;

	@GetMapping("/api/artists")
	public Iterable<Artist> getArtists() {
		return artistRepo.findAll();
	}

	@GetMapping("/api/artists/{id}")
	public String getArtist(@PathVariable Long id, Model model) throws Exception {
		Optional<Artist> artist = artistRepo.findById(id);
		if (artist.isPresent()) {
			model.addAttribute("artist", artist.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
	}

	@GetMapping("/api/albums")
	public Iterable<Album> getAlbums() {
		return albumRepo.findAll();
	}

	@GetMapping("/api/albums/{id}")
	public String getAlbum(@PathVariable Long id, Model model) throws Exception {
		Optional<Album> album = albumRepo.findById(id);
		if (album.isPresent()) {
			model.addAttribute("album", album.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
	}

	@GetMapping("/api/songs")
	public Iterable<Song> getSongs() {
		return songRepo.findAll();
	}

	@GetMapping("/api/songs/{id}")
	public String getSong(@PathVariable Long id, Model model) throws Exception {
		Optional<Song> song = songRepo.findById(id);
		if (song.isPresent()) {
			model.addAttribute("song", song.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
	}
}
