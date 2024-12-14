package com.Er.erDiagram.commentController;

import com.Er.erDiagram.Repository.CommentRepository;
import com.Er.erDiagram.Repository.PostRepository;
import com.Er.erDiagram.entity.Comment;
import com.Er.erDiagram.entity.Post;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class commentController {

    private CommentRepository commentRepository;
    private PostRepository postRepository;

    public commentController(CommentRepository commentRepository, PostRepository postRepository)
    {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @PostMapping
    public String createComment(@RequestBody Comment comment, @RequestParam long postId )
    {

        Post post=postRepository.findById(postId).get();
        comment.setPost(post);
        commentRepository.save(comment);
        return "Comment Created Successfully";


    }

}
