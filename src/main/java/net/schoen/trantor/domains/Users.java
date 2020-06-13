package net.schoen.trantor.domains;

import net.schoen.trantor.entities.UserEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

import static net.schoen.trantor.config.XmlConstants.NAMESPACE_A;

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {

    public Users() {
    }

    public Users(List<UserEntity> users) {
        this.users = users;
    }

    @XmlElement(name = "user", namespace = NAMESPACE_A)
    private List<UserEntity> users;

    public List<UserEntity> getMessages() {
        return users;
    }

    public void setMessages(List<UserEntity> users) {
        this.users = users;
    }
}
