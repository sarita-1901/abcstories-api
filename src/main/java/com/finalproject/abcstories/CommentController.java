package com.finalproject.abcstories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class CommentController {

    @Autowired
    CommentRepository commentRepository;

    //GET all comments for a content id
    @GetMapping("/content/comments")
    public ResponseEntity<List<Comments>> getContentComments(){
     //   List<Comments> commentsList = (List<Comments>) commentRepository.findAllBycontentid(parseInt(contentId));
        List<Comments> commentsList = (List<Comments>) commentRepository.findAll();
        System.out.println("In comments get");
        return ResponseEntity.status(HttpStatus.OK).body(commentsList);
    }

    //POST a new response to existing ticket
    @PostMapping("/content/comment")
    public ResponseEntity<String> addContentComment(@RequestBody Comments contentComments){
        commentRepository.save(contentComments);
        return ResponseEntity.status(HttpStatus.CREATED).body("Response added to content: "+contentComments.getContentid());
    }
}
