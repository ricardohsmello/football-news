package br.com.ricas.service;


import br.com.ricas.domain.entity.Team;
import br.com.ricas.infrastructure.entity.TeamEntity;
import br.com.ricas.infrastructure.repository.TeamRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class TeamService {

    @Inject
    private TeamRepository tamRepository;
    @Transactional
    public TeamEntity create(Team team)  {
        TeamEntity teamEntity = new TeamEntity();
        teamEntity.setName(team.getName());

        tamRepository.persist(teamEntity);

        return teamEntity;
    }
    @Transactional
    public List<TeamEntity> list()  {
        return tamRepository.listAll();
    }

}
