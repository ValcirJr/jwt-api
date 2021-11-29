package com.junior.jwtapi.repo;

import com.junior.jwtapi.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Long> {
}
