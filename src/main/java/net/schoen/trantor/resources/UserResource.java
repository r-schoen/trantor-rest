package net.schoen.trantor.resources;


import net.schoen.trantor.entities.UserEntity;
import net.schoen.trantor.repositories.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserRepository userRepository;

    @GET
    public List<UserEntity> hello() {
        return userRepository.all();
    }

    @GET
    @Path("/{id}")
    public UserEntity getById(@PathParam("id") Integer id) {
        return userRepository.findById(id);
    }
}
