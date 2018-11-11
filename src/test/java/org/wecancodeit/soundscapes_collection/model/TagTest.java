package org.wecancodeit.soundscapes_collection.model;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.soundscapes_collection.Controller.ApiController;
import org.wecancodeit.soundscapes_collection.models.Album;
import org.wecancodeit.soundscapes_collection.models.Artist;
import org.wecancodeit.soundscapes_collection.models.Tag;
import org.wecancodeit.soundscapes_collection.repository.AlbumRepository;
import org.wecancodeit.soundscapes_collection.repository.SongRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TagTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public Collection testGetTag() throws Exception {
		Tag tag = new Tag("");
		List<Tag> tags = Collections.singletonList(tag);
		given(ApiController.getTagName().willReturn(tags));
		mvc.perform(get("/api/tags").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].tagName", is(tag.getTagName())));
	}
}
