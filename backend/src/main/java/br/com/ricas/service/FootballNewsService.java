package br.com.ricas.service;

import br.com.ricas.domain.GroupBuilder;
import br.com.ricas.domain.TeamEnum;
import br.com.ricas.domain.entity.User;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FootballNewsService {

    GroupBuilder gp = new GroupBuilder();

    public void subscribe(TeamEnum team, User user) {
        gp.create(team).subscribe(user);
    }

    public void notify(String msg) {
        gp.notify(msg);
    }

}
