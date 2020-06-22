package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;


@Entity
@Table(name = "threads", schema = "message_board")
public class ThreadEntity extends PanacheEntityBase {

    @JsonbProperty("user")
    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    public UserEntity userEntity;

    @OneToMany
    @JoinColumn(name = "thread_id", referencedColumnName = "thread_id")
    public List<ReplyEntity> replies;

    @Id
    @SequenceGenerator(name = "thread-gen", sequenceName = "threads_thread_id_seq", schema = "message_board")
    @GeneratedValue(generator = "thread-gen", strategy = GenerationType.IDENTITY)
    @Column(name = "thread_id")
    public Integer thread_id;

    @Column(name = "title")
    public String title;

    @Column(name = "body")
    public String body;
}
