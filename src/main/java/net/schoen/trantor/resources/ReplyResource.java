package net.schoen.trantor.resources;

import net.schoen.trantor.domains.ReplyRequest;
import net.schoen.trantor.entities.ReplyEntity;
import net.schoen.trantor.repositories.ReplyRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

@Path("/api/replies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReplyResource {
    // try this idea: https://quarkus.io/guides/rest-json#creating-your-first-json-rest-service

    private Set<ReplyEntity> replies = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

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
    @Transactional
    public void putById(ReplyRequest reply) {
        ReplyEntity r = new ReplyEntity();
        r.body = reply.getBody();
        r.userId = reply.getUserId();
        r.threadId = reply.getThreadId();
        r.persist();
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
