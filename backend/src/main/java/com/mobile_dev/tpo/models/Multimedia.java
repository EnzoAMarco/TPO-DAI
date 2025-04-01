package com.mobile_dev.tpo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "multimedia")
@Getter
@Setter
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

    public Multimedia() {
    }
}