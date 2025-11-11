package com.devsuperior.demo.entities;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import java.util.Objects;

@Entity
@Table(name = "tb_role")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;


    public Role() {

    }

    public Role(Long id, String authority) {
        this.id = id;
        this.authority = authority;

    }
@Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Role role)) return false;

        return Objects.equals(authority, role.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(authority);
    }
}