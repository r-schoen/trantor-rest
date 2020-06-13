package net.schoen.trantor.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import net.schoen.trantor.entities.UserEntity;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class UserRepository implements PanacheRepository<UserEntity> {

    public UserEntity findById(Integer id) {
        return find("user_id", id).firstResult();
    }

    public List<UserEntity> all() {
        return listAll(Sort.ascending("user_id"));
    }
}
