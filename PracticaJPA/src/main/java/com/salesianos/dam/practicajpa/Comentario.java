package com.salesianos.dam.practicajpa;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Comentario {

    @Id @GeneratedValue
    private Long id;

    private String texto;


    private String autor;

    @ManyToOne
    @JoinColumn(name = "tarea_id")
    private Tarea tarea;




}
