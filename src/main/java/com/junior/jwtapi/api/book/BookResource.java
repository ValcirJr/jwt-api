package com.junior.jwtapi.api.book;

import com.junior.jwtapi.domain.Book;
import com.junior.jwtapi.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api/books") @RequiredArgsConstructor
public class BookResource {
    private final BookService bookService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Book>> findBooks(){
        return ResponseEntity.ok().body(bookService.findAll());
    }
}
