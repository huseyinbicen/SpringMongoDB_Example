package com.hb.joblisting.repository;


import com.hb.joblisting.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
