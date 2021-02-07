package com.reactive.examples.location.town;

import com.reactive.examples.location.town.TownService;
import com.reactive.examples.location.town.TownEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/town")
public class TownController {

    private final TownService townService;

    public TownController(TownService townService) {
        this.townService = townService;
    }

    @GetMapping
    public Flux<TownEntity> getAll() {
        return townService.findAll();
    }
}
