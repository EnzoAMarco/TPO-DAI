package com.mobile_dev.tpo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "multimedia")
public class Multimedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontenido")
    private Long idContenido;

    @ManyToOne
    @JoinColumn(name = "idpaso")
    private Paso paso;

    @Column(name = "tipo_contenido")
    private String tipoContenido;

    @Column(name = "extension")
    private String extension;

    @Column(name = "urlcontenido")
    private String urlContenido;
}