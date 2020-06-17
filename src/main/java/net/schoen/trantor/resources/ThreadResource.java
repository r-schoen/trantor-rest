package net.schoen.trantor.resources;

import net.schoen.trantor.repositories.ThreadRepository;
import net.schoen.trantor.entities.ThreadEntity;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/threads")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ThreadResource {

    @Inject
    ThreadRepository threadRepository;

    @GET
    public List<ThreadEntity> getAll() {
        return threadRepository.all();
    }

    @GET
    @Path("/{id}")
    public ThreadEntity getById(@PathParam("id") Integer id) {
        return threadRepository.findById(id);
    }

    @PUT
    @Transactional
    public void save(String body) {
        ThreadEntity e = new ThreadEntity();
        e.body = body;
        e.persist();
    }
}