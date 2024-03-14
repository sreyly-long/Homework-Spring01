package org.example.homeworkspring001;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    private List<Post> posts = new ArrayList<>();

    //Insert Post
    @PostMapping
    public ResponseEntity<?> insertPosts(@RequestBody Post p) {
        posts.add(p);
        return  ResponseEntity.ok(p);
    }
}
