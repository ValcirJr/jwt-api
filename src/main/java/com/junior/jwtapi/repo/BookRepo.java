package com.junior.jwtapi.repo;

import com.junior.jwtapi.domain.Author;
import com.junior.jwtapi.domain.Book;
import com.junior.jwtapi.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(Author author);
    List<Book> findAllByPublisher(Publisher publisher);
}
