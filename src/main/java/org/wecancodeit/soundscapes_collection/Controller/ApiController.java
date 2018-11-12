package org.wecancodeit.soundscapes_collection.Controller;

import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.soundscapes_collection.models.Album;
import org.wecancodeit.soundscapes_collection.models.Artist;
import org.wecancodeit.soundscapes_collection.models.Song;
import org.wecancodeit.soundscapes_collection.models.Tag;
import org.wecancodeit.soundscapes_collection.repository.AlbumRepository;
import org.wecancodeit.soundscapes_collection.repository.ArtistRepository;
import org.wecancodeit.soundscapes_collection.repository.SongRepository;
import org.wecancodeit.soundscapes_collection.repository.TagRepository;

@RestController
public class ApiController {

	@Autowired
	ArtistRepository artistRepo;

	@Autowired
	AlbumRepository albumRepo;

	@Autowired
	SongRepository songRepo;

	@Autowired
	TagRepository tagRepo;

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

	@GetMapping("/api/tags")
	public Iterable<Tag> getTagName() {
		// I don't know if the /tags is the right path but we can change it.
		return tagRepo.findAll();
	}
	@PostMapping("/artists/add")
	public Iterable<Artist> addArtist(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String name = json.getString("name");
		String imageUrl = json.getString("imageUrl");
		String artistHometown = json.getString("artistHometown");
		artistRepo.save(new Artist( name, imageUrl,artistHometown));

		return artistRepo.findAll();
	}
	
	@PostMapping("/albums/add")
	public Iterable<Album> addAlbum(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		
		String title = json.getString("title");
		
		String recordLabel = json.getString("recordLabel");
		String imageUrl = json.getString("imageUrl");
		Artist artist = artistRepo.findById(Long.parseLong(json.getString("artist"))).get();
		albumRepo.save(new Album( title, imageUrl, recordLabel, artist));

		return albumRepo.findAll();
	}
	
	@PostMapping("/songs/add")
	public Iterable<Song> addSong(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		
		String title = json.getString("title");
		
		String duration = json.getString("duration");
		Album album = albumRepo.findById(Long.parseLong(json.getString("album"))).get();
		songRepo.save(new Song( title, duration, album));

		return songRepo.findAll();
	}

}