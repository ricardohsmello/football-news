package br.com.ricas.domain;

import br.com.ricas.domain.entity.User;

import java.util.List;

public class GroupBuilder {
    private Group group;

    public GroupBuilder create(TeamEnum team) {
        this.group = new Group(team);
        return this;
    }

    public GroupBuilder subscribe(List<User> users) {
        for (User user : users) {
           subscribe(user);
        }
        return this;
    }

    public GroupBuilder subscribe(User user) {
        this.group.subscribe(user);
        return this;
    }

    public GroupBuilder unsubscribe(User user) {
        this.group.unsubscribe(user);
        return this;
    }


    public GroupBuilder notify(String message) {
        this.group.notify(message);
        return this;
    }
}