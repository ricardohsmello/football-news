package br.com.ricas.domain;
import java.util.*;

public class Group {
    Map<TeamEnum, List<FootballNews>> listeners = new HashMap<>();

    private TeamEnum teamEnum;

    public Group(TeamEnum teamEnum) {
        this.teamEnum = teamEnum;
        this.listeners.put(teamEnum, new ArrayList<>());
    }

    public void subscribe(FootballNews user) {
        List<FootballNews> list = listeners.get(teamEnum);
        list.add(user);
     }

    public void unsubscribe(FootballNews user) {
        List<FootballNews> list = listeners.get(teamEnum);
        list.remove(user);
    }

    public void notify(String msg) {
        List<FootballNews> users = listeners.get(teamEnum);
        for (FootballNews sub : users) {
            sub.notify(teamEnum, msg);
        }
    }
}