package com.reactive.examples.location.town;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TownRepository extends ReactiveCrudRepository<TownEntity, Long> {
}