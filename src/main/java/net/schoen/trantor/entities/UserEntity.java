package net.schoen.trantor.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
@Entity
@Table(name = "users", schema = "message_board")
public class UserEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue
    @XmlAttribute(name = "user-id")
    @Column(name = "user_id")
    public Integer userId;

    @Column(name = "first_name")
    @XmlElement(name = "first-name")
    public String fname;

    @Column(name = "last_name")
    @XmlElement(name ="first-name")
    public String lname;
}
