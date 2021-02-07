package com.reactive.examples.location.service;

import com.reactive.examples.location.address.AddressEntity;
import com.reactive.examples.location.town.TownEntity;
import lombok.Builder;
import lombok.Getter;
import reactor.util.function.Tuple2;

import java.io.Serializable;
import java.util.function.Function;

@Builder
@Getter
public class LocationResponse implements Serializable {

    private final String firstLine;
    private final String secondLine;
    private final String thirdLine;
    private final String postcode;
    private final String town;

    static Function<Tuple2<AddressEntity, TownEntity>, LocationResponse> convert = (tuple2) ->
            LocationResponse.builder().firstLine(tuple2.getT1().getFirstLine())
                    .secondLine(tuple2.getT1().getSecondLine())
                    .thirdLine(tuple2.getT1().getThirdLine())
                    .postcode(tuple2.getT1().getPostcode())
                    .town(tuple2.getT2().getName())
                    .build();
}