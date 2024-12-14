package com.Er.erDiagram.PostController;

import com.Er.erDiagram.Repository.CommentRepository;
import com.Er.erDiagram.Repository.PostRepository;
import com.Er.erDiagram.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private PostRepository postRepository;


    public PostController(PostRepository postRepository)
    {
        this.postRepository=postRepository;

    }

    @PostMapping
    public String CreatePost(@RequestBody Post post)
    {
        postRepository.save(post);
        System.out.println(postRepository+"dummy");
        return "Post Created Successfully";
    }

    @DeleteMapping
    public String deletepost()
    {
        postRepository.deleteById(2L);
        return "Post Deleted Successfully";

    }


}
