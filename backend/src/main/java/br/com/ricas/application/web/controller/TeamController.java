package br.com.ricas.application.web.controller;

import br.com.ricas.domain.entity.Team;
import br.com.ricas.domain.entity.User;
import br.com.ricas.infrastructure.entity.TeamEntity;
import br.com.ricas.infrastructure.entity.UserEntity;
import br.com.ricas.service.TeamService;
import br.com.ricas.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/team")

public class TeamController {

    @Inject
    private TeamService teamService;
    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    public TeamEntity create(Team team) {
        return teamService.create(team);
    }

    @GET()
    public List<TeamEntity> list() {
        return teamService.list();
    }
}
