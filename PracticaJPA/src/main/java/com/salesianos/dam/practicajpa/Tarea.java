package com.salesianos.dam.practicajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Tarea {

    @Id
    @GeneratedValue
    private Long id;

    private String texto;

    private String autor;



}
