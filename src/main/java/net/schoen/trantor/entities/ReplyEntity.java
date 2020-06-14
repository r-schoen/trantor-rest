package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;


@Entity
@Table(name = "replies", schema = "message_board")
public class ReplyEntity extends PanacheEntityBase {
    @Id
    @SequenceGenerator(name = "replies-gen", sequenceName = "replies_reply_id_seq", schema = "message_board")
    @GeneratedValue(generator = "replies-gen", strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id")
    public Integer replyId;

    @Column(name = "user_id")
    public Integer userId;

    @Column(name = "thread_id")
    public Integer threadId;

    @Column(name = "body")
    public String body;
}
