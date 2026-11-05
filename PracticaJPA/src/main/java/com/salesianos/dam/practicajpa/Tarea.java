package com.salesianos.dam.practicajpa;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;


    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "tarea_etiqueta",
            joinColumns = @JoinColumn(name = "tarea_id"),
            inverseJoinColumns = @JoinColumn(name = "etiqueta_id"))
    private Set<Etiqueta> etiquetas = new HashSet<>();

    //metodos helper -Tarea

    public Tarea addComentario(Comentario c) {
        comentarios.add(c);
        //
        return this;
    }

    public Tarea removeProducto(Comentario c) {
        comentarios.remove(c);
        //
        return this;
    }
}
