package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;


@Entity
@Table(name = "replies", schema = "message_board")
public class ReplyEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue
    @Column(name = "reply_id")
    public Integer replyId;

    @Column(name = "user_id")
    public Integer userId;

    @Column(name = "thread_id")
    public Integer threadId;

    @Column(name = "body")
    public String body;
}
