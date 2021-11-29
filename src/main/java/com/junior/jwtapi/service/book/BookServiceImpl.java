package com.junior.jwtapi.service.book;

import com.junior.jwtapi.domain.Author;
import com.junior.jwtapi.domain.Book;
import com.junior.jwtapi.domain.Publisher;
import com.junior.jwtapi.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional @Slf4j @RequiredArgsConstructor
public class BookServiceImpl implements BookService{
    private final BookRepo repo;

    @Override
    public Book save(Book book) {
        log.info("Saving book {}", book.getTitle());
        return repo.save(book);
    }

    @Override
    public List<Book> findAll() {
        log.info("fetching books");
        return repo.findAll();
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        log.info("fetching books by author {}", author.getName());
        return repo.findAllByAuthor(author);
    }

    @Override
    public List<Book> findByPublisher(Publisher publisher) {
        log.info("fetching books by publisher {}", publisher.getName());
        return repo.findAllByPublisher(publisher);
    }
}
