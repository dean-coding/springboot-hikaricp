package com.rangers.dbsource;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.CollectionUtils;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Map<String, DataSource> beansOfType = context.getBeansOfType(DataSource.class);
		if (!CollectionUtils.isEmpty(beansOfType)) {
			System.out.println("当前配置的数据源:");
			beansOfType.forEach((k, v) -> {
				System.out.println("[k=" + k + ",v=" + v+"]");
			});
		}
	}
}
