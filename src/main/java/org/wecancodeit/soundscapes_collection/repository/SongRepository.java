package org.wecancodeit.soundscapes_collection.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.soundscapes_collection.models.Song;

public interface SongRepository extends CrudRepository<Song, Long> {

}
