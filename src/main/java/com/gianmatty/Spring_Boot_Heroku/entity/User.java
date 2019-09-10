package com.gianmatty.Spring_Boot_Heroku.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1671417246199538663L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    @Column
    @NotBlank
    @Size(min = 5, max = 8, message = "No se cumple las reglas del tamano")
    private String firstName;
    @Column
    @NotBlank
    private String lastName;
    @Column
    @NotBlank
    private String email;
    @Column
    @NotBlank
    private String username;
    @Column
    @NotBlank
    private String password;

    @Transient
    private String confirmPassword;

    @Size(min = 1)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


    public User() {
        super();
    }

    public User(Long id) {
        super();
        this.id = id;
    }

}
