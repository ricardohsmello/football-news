package br.com.ricas.infrastructure.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "user_entity")
public class TeamEntity extends PanacheEntity {

    private String name;
    private String email;

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TeamEntity() {}
}
