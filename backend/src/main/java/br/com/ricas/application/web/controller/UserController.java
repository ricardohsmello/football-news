package br.com.ricas.application.web.controller;

import br.com.ricas.domain.entity.User;
import br.com.ricas.infrastructure.entity.UserEntity;
import br.com.ricas.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    private UserService userService;
    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    public UserEntity create(User user) {

        UserEntity userEntity = userService.create(user);
        return userEntity;
    }

    @GET()
    public List<UserEntity> list() {
        return userService.list();
     }
}
