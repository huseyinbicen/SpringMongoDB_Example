package com.hb.joblisting.service.impl;

import com.hb.joblisting.entity.Post;
import com.hb.joblisting.repository.PostRepository;
import com.hb.joblisting.service.PostQueryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostQueryServiceImpl implements PostQueryService {

    private final PostRepository postRepository;
    public PostQueryServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
