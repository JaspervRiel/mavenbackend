package com.hours.webapp.Comment;

import com.hours.webapp.Image.Image;
import com.hours.webapp.Image.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentRepository CommentRepo;
    @Autowired
    ImageRepository imagerepo;

    @CrossOrigin
    @PostMapping("/CreateComment")
    Comment CreateComment(@RequestBody Comment comment) {
        return CommentRepo.save(comment);
    }

    @CrossOrigin
    @GetMapping("/getComments")
    List<Comment> getComments() {
        Image image = imagerepo.findById(1).orElse(null);
        List<Comment> listComments = CommentRepo.FindByImageID(image);
        return listComments;
    }
}
