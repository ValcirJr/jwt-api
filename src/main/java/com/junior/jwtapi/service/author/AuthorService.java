package com.junior.jwtapi.service.author;

import com.junior.jwtapi.domain.Author;

import java.util.List;

public interface AuthorService {
    Author save(Author author);
    List<Author> findAll();
}
