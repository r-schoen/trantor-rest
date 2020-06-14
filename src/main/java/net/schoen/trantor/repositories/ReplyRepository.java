package net.schoen.trantor.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import net.schoen.trantor.domains.ReplyRequest;
import net.schoen.trantor.entities.ReplyEntity;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class ReplyRepository implements PanacheRepository<ReplyEntity> {

    public ReplyEntity findById(Integer replyId) {
        return find("reply_id", replyId).firstResult();
    }

    public List<ReplyEntity> findByThread(Integer threadId) {
        return list("thread_id", threadId);
    }

    public List<ReplyEntity> findByUser(Integer userId) {
        return list("user_id", userId);
    }

    public List<ReplyEntity> all() {
        return listAll(Sort.ascending("reply_id"));
    }

    public void save(ReplyRequest request) {

    }
}
