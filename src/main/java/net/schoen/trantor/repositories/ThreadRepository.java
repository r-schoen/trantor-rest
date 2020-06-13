package net.schoen.trantor.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import net.schoen.trantor.domains.Threads;
import net.schoen.trantor.entities.ThreadEntity;

import javax.inject.Singleton;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@Singleton
public class ThreadRepository implements PanacheRepository<ThreadEntity> {
    public ThreadEntity findById(Integer id) {
        return find("thread_id", id).firstResult();
    }

    public Threads findByUserId(Integer id) {
        return new Threads(list("user_id", id));
    }

    @XmlElementWrapper(name = "messages")
    public Threads all() {
        return new Threads(listAll(Sort.ascending("thread_id")));
    }
}
