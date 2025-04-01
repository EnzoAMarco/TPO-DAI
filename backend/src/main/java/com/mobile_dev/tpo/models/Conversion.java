package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "conversiones")
@Getter
@Setter
public class Conversion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconversion")
    private Long idConversion;

    @ManyToOne
    @JoinColumn(name = "idunidadorigen")
    private Unidad unidadOrigen;

    @ManyToOne
    @JoinColumn(name = "idunidaddestino")
    private Unidad unidadDestino;

    @Column(name = "factorconversiones")
    private float factorConversiones;

    public Conversion() {
    }
}
