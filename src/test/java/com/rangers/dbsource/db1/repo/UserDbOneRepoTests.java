package com.rangers.dbsource.db1.repo;

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

import com.rangers.dbsource.db1.UserDbOneEntity;

@ActiveProfiles("multi")
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDbOneRepoTests {

	@Autowired
	private UserDbOneRepo repo;

	@Before
	public void init() {
		List<UserDbOneEntity> entities = Arrays.asList(new UserDbOneEntity("AA", "BB"), new UserDbOneEntity("AA", "BB"),
				new UserDbOneEntity("AA", "BB"));
		repo.save(entities);
	}
	
	@After
	public void destory() {
		repo.deleteAll();
	}

	@Test
	public void find() {
		List<UserDbOneEntity> findAll = repo.findAll();
		System.err.println(findAll);
		Assert.assertNotNull(findAll);
		Assert.assertEquals(findAll.size(), 3);
	}

}
