package com.junior.jwtapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.EnumType.*;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Book {
    @Id @GeneratedValue(strategy = IDENTITY)
    Long id;
    String title;
    int pages;
    @ManyToOne(fetch = LAZY) @JsonIgnoreProperties({"books", "hibernateLazyInitializer"})
    Publisher publisher;
    @Enumerated(STRING)
    CoverType coverType;
    @ManyToOne(fetch = LAZY) @JsonIgnoreProperties({"books", "hibernateLazyInitializer"})
    Author author;
    LocalDate publicationDate;
    String language;
}
