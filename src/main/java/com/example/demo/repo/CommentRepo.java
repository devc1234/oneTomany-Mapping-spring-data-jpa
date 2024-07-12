package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Comments;

public interface CommentRepo extends JpaRepository<Comments, Long>{

}
