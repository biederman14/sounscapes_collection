package org.wecancodeit.soundscapes_collection.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.soundscapes_collection.models.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {

}
