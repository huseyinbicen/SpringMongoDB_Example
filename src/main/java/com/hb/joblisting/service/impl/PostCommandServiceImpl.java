package com.hb.joblisting.service.impl;

import com.hb.joblisting.entity.Post;
import com.hb.joblisting.repository.PostRepository;
import com.hb.joblisting.service.PostCommandService;
import org.springframework.stereotype.Service;

@Service
public class PostCommandServiceImpl implements PostCommandService {

    private final PostRepository postRepository;

    public PostCommandServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post savePost(Post post) {
        try {
            return postRepository.save(post);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
