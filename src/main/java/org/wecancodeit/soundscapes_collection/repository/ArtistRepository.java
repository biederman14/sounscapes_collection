package org.wecancodeit.soundscapes_collection.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.soundscapes_collection.models.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
