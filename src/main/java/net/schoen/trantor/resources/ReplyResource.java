package net.schoen.trantor.resources;

import net.schoen.trantor.entities.ReplyEntity;
import net.schoen.trantor.repositories.ReplyRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/replies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReplyResource {
    @Inject
    ReplyRepository replyRepository;

    @GET
    public List<ReplyEntity> all() {
        return replyRepository.all();
    }

    @GET
    @Path("/reply-id/{id}")
    public ReplyEntity findById(@PathParam("id") Integer id) {
        return replyRepository.findById(id);
    }

    @PUT
    @Path("/reply-id/{id}")
    @Transactional
    public void putById(@PathParam("id") Integer id, ReplyEntity reply) {
        replyRepository.persist(reply);
    }

    @DELETE
    @Path("reply-id/{id}")
    @Transactional
    public void deleteById(@PathParam("id") Integer id) {
        ReplyEntity r = replyRepository.findById(id);
        replyRepository.delete(r);
    }

    @GET
    @Path("/thread-id/{id}")
    public List<ReplyEntity> findByThread(@PathParam("id") Integer id) {
        return replyRepository.findByThread(id);
    }

    @GET
    @Path("/user-id/{id}")
    public List<ReplyEntity> findByUser(@PathParam("id") Integer id) {
        return replyRepository.findByUser(id);
    }
}
