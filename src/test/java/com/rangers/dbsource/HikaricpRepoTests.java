package com.rangers.dbsource;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.rangers.dbsource.entity.HikaricpEntity;

@ActiveProfiles("single")
@RunWith(SpringRunner.class)
@SpringBootTest
public class HikaricpRepoTests {

	@Autowired
	private HikaricpRepo hikaricpRepo;

	@Before
	public void init() {
		List<HikaricpEntity> entities = Arrays.asList(new HikaricpEntity("AA", "BB"), new HikaricpEntity("AA", "BB"),
				new HikaricpEntity("AA", "BB"));
		hikaricpRepo.save(entities);
	}

	@After
	public void destory() {
		hikaricpRepo.deleteAll();
	}

	@Test
	public void find() {
		List<HikaricpEntity> findAll = hikaricpRepo.findAll();
		System.err.println(findAll);
		Assert.assertNotNull(findAll);
		Assert.assertEquals(findAll.size(), 3);
	}

}
