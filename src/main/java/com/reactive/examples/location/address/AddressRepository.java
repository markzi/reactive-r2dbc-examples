package com.reactive.examples.location.address;

import com.reactive.examples.location.address.AddressEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AddressRepository extends ReactiveCrudRepository<AddressEntity, Long> {
}