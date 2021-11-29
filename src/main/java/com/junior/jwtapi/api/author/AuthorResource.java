package com.junior.jwtapi.api.author;

import com.junior.jwtapi.domain.Author;
import com.junior.jwtapi.service.author.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api/authors") @RequiredArgsConstructor
public class AuthorResource {

    private final AuthorService authorService;

    @GetMapping("")
    public ResponseEntity<List<Author>> findAuthors() {
        return ResponseEntity.ok().body(authorService.findAll());
    }
}
