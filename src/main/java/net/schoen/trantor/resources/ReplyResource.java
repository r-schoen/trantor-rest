package net.schoen.trantor.resources;

import net.schoen.trantor.domains.Replies;
import net.schoen.trantor.entities.ReplyEntity;
import net.schoen.trantor.repositories.ReplyRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/replies")
public class ReplyResource {
    @Inject
    ReplyRepository replyRepository;

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Replies all() {
        return replyRepository.all();
    }

    @GET
    @Path("/reply-id/{id}")
    public ReplyEntity findById(@PathParam("id") Integer id) {
        return replyRepository.findById(id);
    }

    @GET
    @Path("/thread-id/{id}")
    public Replies findByThread(@PathParam("id") Integer id) {
        return replyRepository.findByThread(id);
    }

    @GET
    @Path("/user-id/{id}")
    public Replies findByUser(@PathParam("id") Integer id) {
        return replyRepository.findByUser(id);
    }
}
