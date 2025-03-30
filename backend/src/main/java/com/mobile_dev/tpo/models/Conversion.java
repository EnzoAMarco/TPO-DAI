package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "conversiones")
public class Conversion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconversion")
    private Long idConversion;

    @ManyToOne
    @JoinColumn(name = "idunidadorigen")
    private Long idUnidadOrigen;

    @ManyToOne
    @JoinColumn(name = "idunidaddestino")
    private Long idUnidadDestino;

    @Column(name = "factorconversiones")
    private float factorConversiones;
}
