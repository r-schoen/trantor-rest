package net.schoen.trantor.resources;

import net.schoen.trantor.repositories.ThreadRepository;
import net.schoen.trantor.entities.ThreadEntity;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/threads")
public class ThreadResource {

    @Inject
    ThreadRepository threadRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ThreadEntity> getAll() {
        return threadRepository.all();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public ThreadEntity getById(@PathParam("id") Integer id) {
        return threadRepository.findById(id);
    }
}