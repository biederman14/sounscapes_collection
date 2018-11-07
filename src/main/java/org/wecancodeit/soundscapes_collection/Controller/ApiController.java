package org.wecancodeit.soundscapes_collection.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.soundscapes_collection.models.Artist;
import org.wecancodeit.soundscapes_collection.repository.ArtistRepository;

@RestController
public class ApiController {

	@Autowired
	ArtistRepository artistRepo;

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
}
