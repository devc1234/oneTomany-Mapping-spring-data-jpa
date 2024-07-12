package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Comments;
import com.example.demo.Entity.Post;
import com.example.demo.repo.PostRepo;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Autowired
	PostRepo postRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Post post = new Post("this is using jpa sides","description");
		
		
		Comments comments1 = new Comments("all good");
		Comments comments2 = new Comments("all good to go");
		Comments comments3 = new Comments("all know about it");
		
		post.getComments().add(comments1);
		post.getComments().add(comments2);
		post.getComments().add(comments3);
		
		this.postRepo.save(post);
	}

}
