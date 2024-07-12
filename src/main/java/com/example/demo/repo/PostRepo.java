package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Post;

public interface PostRepo extends JpaRepository<Post, Long>{

}
