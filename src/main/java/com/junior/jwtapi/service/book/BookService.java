package com.junior.jwtapi.service.book;

import com.junior.jwtapi.domain.Author;
import com.junior.jwtapi.domain.Book;
import com.junior.jwtapi.domain.Publisher;

import java.util.List;

public interface BookService {
    Book save(Book book);
    List<Book> findAll();
    List<Book> findByAuthor(Author author);
    List<Book> findByPublisher(Publisher publisher);
}
