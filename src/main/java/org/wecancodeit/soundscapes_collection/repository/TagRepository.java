package org.wecancodeit.soundscapes_collection.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.soundscapes_collection.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {

}
