package org.wecancodeit.soundscapes_collection.model;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TagTest {

	@Autowired
	private MockMvc mvc;

//	@Test
//	public Collection testGetTag() throws Exception {
//		Tag tag = new Tag("");
//		List<Tag> tags = Collections.singletonList(tag);
//		given(ApiController.getTagName().willReturn(tags));
//		mvc.perform(get("/api/tags").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
//				.andExpect(jsonPath("$[0].tagName", is(tag.getTagName())));
//	}
}
