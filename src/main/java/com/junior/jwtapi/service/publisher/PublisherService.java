package com.junior.jwtapi.service.publisher;

import com.junior.jwtapi.domain.Publisher;

import java.util.List;

public interface PublisherService {
    Publisher save(Publisher publisher);
    List<Publisher> findAll();
}
