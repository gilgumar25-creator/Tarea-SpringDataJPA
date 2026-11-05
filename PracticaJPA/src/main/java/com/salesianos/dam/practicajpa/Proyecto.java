package com.salesianos.dam.practicajpa;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Proyecto {

    @Id @GeneratedValue
    private Long id;

    @Column(columnDefinition = "VARCHAR(512)")
    private String nombre;

    private String descripcion;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarea> tareas = new ArrayList<>();




    //Métodos helper para ayudar al método de borrado Cascade
    public void agregarTarea (Tarea tarea) {

        tareas.add(tarea);

    }


    public void borrarTarea (Tarea tarea){

        tareas.remove(tarea);

    }

}
