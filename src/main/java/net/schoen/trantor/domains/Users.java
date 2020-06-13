package net.schoen.trantor.domains;

import net.schoen.trantor.entities.UserEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {

    public Users() {
    }

    public Users(List<UserEntity> users) {
        this.users = users;
    }

    @XmlElement(name = "user")
    private List<UserEntity> users;

    public List<UserEntity> getMessages() {
        return users;
    }

    public void setMessages(List<UserEntity> users) {
        this.users = users;
    }
}
