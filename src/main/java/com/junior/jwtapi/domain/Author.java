package com.junior.jwtapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.*;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Author {
    @Id @GeneratedValue(strategy = IDENTITY)
    Long id;
    String name;
    @OneToMany(mappedBy = "author") @JsonIgnore
    List<Book> books;
}
