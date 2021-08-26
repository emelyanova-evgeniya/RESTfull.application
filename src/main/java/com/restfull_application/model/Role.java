package com.restfull_application.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public enum Role implements GrantedAuthority {

    ADMIN, MANAGER, USER;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public String getAuthority() {
        return name();
    }
}
