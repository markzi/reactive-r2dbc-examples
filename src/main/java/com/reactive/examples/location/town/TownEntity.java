package com.reactive.examples.location.town;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("location.town")
public class TownEntity {

    @Id
    private Long id;

    private String name;
}
