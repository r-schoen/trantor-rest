package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "thread")
@Entity
@Table(name = "threads", schema = "message_board")
public class ThreadEntity extends PanacheEntityBase {

    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @XmlElement(name = "user")
    public UserEntity userEntity;

    @Id
    @GeneratedValue
    @Column(name = "thread_id")
    @XmlAttribute(name = "thread-id")
    public Integer messageId;

    @Column(name = "body")
    public String body;


}
