package net.schoen.trantor.resources;

import net.schoen.trantor.entities.ReplyEntity;
import net.schoen.trantor.repositories.ReplyRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/replies")
public class ReplyResource {
    @Inject
    ReplyRepository replyRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ReplyEntity> all() {
        return replyRepository.all();
    }

    @GET
    @Path("/reply-id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ReplyEntity findById(@PathParam("id") Integer id) {
        return replyRepository.findById(id);
    }

    @GET
    @Path("/thread-id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ReplyEntity> findByThread(@PathParam("id") Integer id) {
        return replyRepository.findByThread(id);
    }

    @GET
    @Path("/user-id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ReplyEntity> findByUser(@PathParam("id") Integer id) {
        return replyRepository.findByUser(id);
    }
}
