package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name= "NXS")
@Table(name = "nxs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NXS {
    @Id
    //    @GeneratedValue(generator = "system-uuid")
    @Column(name = "Id", unique = true, nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;
}
