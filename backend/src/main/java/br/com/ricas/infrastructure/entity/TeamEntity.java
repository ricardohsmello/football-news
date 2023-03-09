package br.com.ricas.infrastructure.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "team_entity")
public class TeamEntity extends PanacheEntity {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public TeamEntity() {}
}
