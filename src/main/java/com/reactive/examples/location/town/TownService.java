package com.reactive.examples.location.town;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TownService {

    private final TownRepository townRepository;

    public TownService(TownRepository townRepository) {
        this.townRepository = townRepository;
    }

    public Flux<TownEntity> findAll() {
        return townRepository.findAll();
    }

    public Mono<TownEntity> findById(Long id) {
        return townRepository.findById(id);
    }

}
