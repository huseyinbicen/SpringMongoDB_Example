package com.hb.joblisting.api.controller;

import com.hb.joblisting.entity.Post;
import com.hb.joblisting.service.PostCommandService;
import com.hb.joblisting.service.PostQueryService;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    private final PostQueryService postQueryService;
    private final PostCommandService postCommandService;

    public PostController(PostQueryService postQueryService, PostCommandService postCommandService) {
        this.postQueryService = postQueryService;
        this.postCommandService = postCommandService;
    }

    @ApiIgnore
    @RequestMapping(value = "/")
    private void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    private List<Post> getAllPosts() {
        return postQueryService.getAllPosts();
    }

    @PostMapping("/post")
    private Post addPost(@RequestBody Post post) {
        return postCommandService.savePost(post);
    }
}
