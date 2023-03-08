package br.com.ricas.domain.entity;

import br.com.ricas.domain.FootballNews;
import br.com.ricas.domain.TeamEnum;

public class User implements FootballNews {

    private int id;
    private String email;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String email, int id) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    @Override
    public void notify(TeamEnum teamEnum, String msg) {
        System.out.println("Hello " + name + ", check the following news of " + teamEnum + ": \n" + msg + "\n");
    }
}