package org.acme;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bebida")
public class Bebida extends PanacheEntity {

    public String nome;
    public String tipo;
}
