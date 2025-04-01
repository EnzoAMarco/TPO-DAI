package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tiposreceta", schema = "tpo_dai")
@Getter
@Setter
public class TipoReceta {

    @Id
    @Column(name="idtipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipo;

    @Column(name="descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "tipoReceta", fetch = FetchType.EAGER)
    private List<Receta> recetas;

    public TipoReceta() {
    }
}
