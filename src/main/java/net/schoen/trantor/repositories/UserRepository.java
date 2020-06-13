package net.schoen.trantor.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import net.bytebuddy.TypeCache;
import net.schoen.trantor.domains.Users;
import net.schoen.trantor.entities.UserEntity;

import javax.inject.Singleton;

@Singleton
public class UserRepository implements PanacheRepository<UserEntity> {

    public UserEntity findById(Integer id) {
        return find("user_id", id).firstResult();
    }

    public Users all() {
        return new Users(listAll(Sort.ascending("user_id")));
    }
}
