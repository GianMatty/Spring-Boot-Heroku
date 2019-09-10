package com.gianmatty.Spring_Boot_Heroku.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class Role implements Serializable {

    private static final long serialVersionUID = 6353963609310956029L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    public Role() {
        super();
    }

}
