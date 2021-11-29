package com.junior.jwtapi.service.author;

import com.junior.jwtapi.domain.Author;
import com.junior.jwtapi.repo.AuthorRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Slf4j @Transactional @RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepo repo;

    @Override
    public Author save(Author author) {
        log.info("Saving author {}", author.getName());
        return repo.save(author);
    }

    @Override
    public List<Author> findAll() {
        log.info("Fetching authors");
        return repo.findAll();
    }
}
