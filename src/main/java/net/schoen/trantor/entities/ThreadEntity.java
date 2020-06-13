package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;

import static net.schoen.trantor.config.XmlConstants.NAMESPACE_A;

@XmlRootElement(name = "thread", namespace = NAMESPACE_A)
@Entity
@Table(name = "threads", schema = "message_board")
public class ThreadEntity extends PanacheEntityBase {

    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @XmlElement(name = "user")
    public UserEntity userEntity;

    @OneToMany
    @JoinColumn(name = "thread_id", referencedColumnName = "thread_id")
    @XmlElementWrapper(name = "replies")
    @XmlElement(name = "reply")
    public List<ReplyEntity> replies;

    @Id
    @GeneratedValue
    @Column(name = "thread_id")
    @XmlAttribute(name = "thread-id")
    public Integer thread_id;

    @Column(name = "body")
    public String body;


}
