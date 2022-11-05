package com.advait.projects.eventManager.apis.repository;

import com.advait.projects.eventManager.model.Events;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Events, String> {
}
