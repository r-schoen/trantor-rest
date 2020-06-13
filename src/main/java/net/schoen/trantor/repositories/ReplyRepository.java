package net.schoen.trantor.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import net.schoen.trantor.domains.Replies;
import net.schoen.trantor.entities.ReplyEntity;

import javax.inject.Singleton;

@Singleton
public class ReplyRepository implements PanacheRepository<ReplyEntity> {

    public ReplyEntity findById(Integer replyId) {
        return find("reply_id", replyId).firstResult();
    }

    public Replies findByThread(Integer threadId) {
        return new Replies(list("thread_id", threadId));
    }

    public Replies findByUser(Integer userId) {
        return new Replies(list("user_id", userId));
    }

    public Replies all() {
        return new Replies(listAll());
    }
}
