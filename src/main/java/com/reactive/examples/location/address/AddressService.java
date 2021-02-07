package com.reactive.examples.location.address;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Flux<AddressEntity> findAll() {
        return addressRepository.findAll();
    }
}
