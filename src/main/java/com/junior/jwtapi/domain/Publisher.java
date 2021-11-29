package com.junior.jwtapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.*;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Publisher {
    @Id @GeneratedValue(strategy = IDENTITY)
    Long id;
    String name;
    @OneToMany(mappedBy = "publisher")
    List<Book> books;
}
