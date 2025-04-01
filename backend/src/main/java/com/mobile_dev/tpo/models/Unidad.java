package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "unidades")
@Getter
@Setter
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idunidad")
    private Long idUnidad;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "unidadOrigen", fetch = FetchType.EAGER)
    private List<Conversion>conversionsOrigen;

    @OneToMany(mappedBy = "unidadDestino", fetch = FetchType.EAGER)
    private List<Conversion>conversionDestino;

    @OneToMany(mappedBy = "unidad", fetch = FetchType.EAGER)
    private List<Utilizado> utilizados;

    public Unidad() {
    }
}