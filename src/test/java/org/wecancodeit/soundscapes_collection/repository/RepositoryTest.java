package org.wecancodeit.soundscapes_collection.repository;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wecancodeit.soundscapes_collection.models.Artist;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositoryTest {
	@Resource
	ArtistRepository artistRepo;

	@Test
	public void shouldAddArtistToRepo() {
		Artist beck = new Artist();
		artistRepo.save(beck);
		Iterable<Artist> result = artistRepo.findAll();
		assertThat(result, hasItems(beck));
	}

	@Test
	public void returnsAllArtistsInRepo() {
		Artist beck = new Artist();
		artistRepo.save(beck);
		Artist wacco = new Artist();
		artistRepo.save(wacco);
		Iterable<Artist> result = artistRepo.findAll();
		assertThat(result, hasItems(beck, wacco));
	}

}
