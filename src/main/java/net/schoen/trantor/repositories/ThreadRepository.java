package net.schoen.trantor.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import net.schoen.trantor.entities.ThreadEntity;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class ThreadRepository implements PanacheRepository<ThreadEntity> {

    public ThreadEntity findById(Integer id) {
        return find("thread_id", id).firstResult();
    }

    public List<ThreadEntity> findByUserId(Integer id) {
        return list("user_id", id);
    }

    public List<ThreadEntity> all() {
        return listAll(Sort.ascending("thread_id"));
    }
}
