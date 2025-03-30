package com.mobile_dev.tpo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "escribi el nombre de la tabla", schema = "nombre del schema/db")
public class ModelEjemplo {

    @Id
    @Column(name = "poner nombre si es diferente")
    private Long Id;

}
