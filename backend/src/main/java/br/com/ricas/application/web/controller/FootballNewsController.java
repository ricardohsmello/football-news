package br.com.ricas.application.web.controller;

import br.com.ricas.service.FootballNewsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/football")
public class FootballNewsController {

    @Inject
    FootballNewsService footballNewsService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
//
//    @Path("/sub/corinthians")
//    @GET()
//    @Produces(MediaType.TEXT_PLAIN)
//    public String corinthians() {
//        User user = new User(" Ricardo");
//        footballNewsService.subscribe(TeamEnum.CORINTHIANS, user);
//        return "sub on Corinthians";
//    }
//    @Path("/sub/flamengo")
//    @GET()
//    @Produces(MediaType.TEXT_PLAIN)
//    public String flamengo(){
//        User user = new User("Adriano");
//        footballNewsService.subscribe(TeamEnum.FLAMENGO, user);
//        return "sub on Flamengo";
//    }

    @Path("/news")
    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    public String A(){
        footballNewsService.notify("Here some message for you");
        return "sub on Flamengo";
    }
}