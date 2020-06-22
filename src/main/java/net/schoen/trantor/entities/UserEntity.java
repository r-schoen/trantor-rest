package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "message_board")
public class UserEntity extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "user-gen", sequenceName = "users_user_id_seq", schema = "message_board")
    @GeneratedValue(generator = "user-gen", strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Integer userId;

    @Column(name = "username")
    public String username;

    @Column(name = "email")
    public String email;
}
