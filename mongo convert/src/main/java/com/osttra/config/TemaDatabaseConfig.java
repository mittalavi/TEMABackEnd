package com.osttra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(
	    basePackages = "com.osttra.repository.temaDatabase", // Specify the package for Database 2 repositories
	    mongoTemplateRef = "mongoTemplate2"
	)
public class TemaDatabaseConfig {

	 @Bean(name = "mongoTemplate2")
	    public MongoTemplate mongoTemplate2() {
	        return new MongoTemplate(MongoClients.create("mongodb://localhost:27017/Jisaw"), "Jigsaw");
	    }
}
