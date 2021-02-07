package com.reactive.examples.location.service;

import com.reactive.examples.location.address.AddressService;
import com.reactive.examples.location.town.TownService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class LocationService {

    private final AddressService addressService;
    private final TownService townService;

    public LocationService(AddressService addressService, TownService townService) {
        this.addressService = addressService;
        this.townService = townService;
    }

    public Mono<List<LocationResponse>> findAllAddresses() {
        return addressService
                .findAll()
                .flatMap(address -> Mono.just(address)
                        .zipWith(townService.findById(address.getTownId())))
                .map(LocationResponse.convert).collectList();
    }


}
