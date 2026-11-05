package com.salesianos.dam.practicajpa;
import jakarta.persistence.Column;
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
public class Etiqueta {

    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "VARCHAR(512)")
    private String nombre;


}
