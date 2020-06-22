package net.schoen.trantor.resources;


import net.schoen.trantor.domains.ReplyRequest;
import net.schoen.trantor.domains.UserRequest;
import net.schoen.trantor.entities.UserEntity;
import net.schoen.trantor.repositories.UserRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
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

    @GET
    @Path("/find-by-username/{username}")
    public UserEntity getByusername(@PathParam("username") String username) {
        return userRepository.findByUsername(username);
    }

    @PUT
    @Transactional
    public void put(UserRequest request) {
        UserEntity e = new UserEntity();
        e.username = request.getUsername();
        e.email = request.getEmail();
        e.persist();
    }
}
