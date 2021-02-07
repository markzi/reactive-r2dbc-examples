package com.reactive.examples.location.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("location.address")
public class AddressEntity {

    @Id
    private Long id;

    @Column("first_line")
    private String firstLine;

    @Column("second_line")
    private String secondLine;

    @Column("third_line")
    private String thirdLine;

    @Column("postcode")
    private String postcode;

    @Column("town_id")
    private Long townId;
}
