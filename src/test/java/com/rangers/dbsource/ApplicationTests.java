package com.rangers.dbsource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("multi")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	

	@Test
	public void spelExpressTest() {
		ExpressionParser parser = new SpelExpressionParser();
		Boolean bt = parser.parseExpression("3 between {2,5}").getValue(Boolean.class);
		Assert.assertTrue(bt);
	}

}
