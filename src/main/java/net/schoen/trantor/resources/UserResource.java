package net.schoen.trantor.resources;


import net.schoen.trantor.domains.Users;
import net.schoen.trantor.entities.UserEntity;
import net.schoen.trantor.repositories.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/users")
public class UserResource {

    @Inject
    UserRepository userRepository;

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Users hello() {
        return userRepository.all();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{id}")
    public UserEntity getById(@PathParam("id") Integer id) {
        return userRepository.findById(id);
    }
}
