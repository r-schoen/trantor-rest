package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import static net.schoen.trantor.config.XmlConstants.NAMESPACE_A;

@XmlRootElement(name = "reply", namespace = NAMESPACE_A)
@Entity
@Table(name = "replies", schema = "message_board")
public class ReplyEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue
    @Column(name = "reply_id")
    @XmlAttribute(name = "reply-id")
    public Integer replyId;

    @Column(name = "user_id")
    @XmlAttribute(name = "user-id")
    public Integer userId;

    @Column(name = "thread_id")
    @XmlAttribute(name = "thread-id")
    public Integer threadId;

    @Column(name = "body")
    @XmlElement(name = "body", namespace = NAMESPACE_A, required = true)
    public String body;
}
