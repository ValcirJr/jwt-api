package com.junior.jwtapi.service.publisher;

import com.junior.jwtapi.domain.Publisher;
import com.junior.jwtapi.repo.PublisherRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Slf4j @Transactional @RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService{
    private final PublisherRepo repo;

    @Override
    public Publisher save(Publisher publisher) {
        log.info("saving publisher {}", publisher.getName());
        return repo.save(publisher);
    }

    @Override
    public List<Publisher> findAll() {
        log.info("fetching publishers");
        return repo.findAll();
    }
}
