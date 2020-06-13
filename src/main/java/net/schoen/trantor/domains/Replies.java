package net.schoen.trantor.domains;

import net.schoen.trantor.config.XmlConstants;
import net.schoen.trantor.entities.ReplyEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;


@XmlRootElement(name = "replies")
@XmlAccessorType(XmlAccessType.FIELD)
public class Replies implements Serializable {

    public Replies() {}

    public Replies(List<ReplyEntity> replies) {
        this.replies = replies;
    }

    @XmlElement(name = "reply", namespace = XmlConstants.NS_A)
    private List<ReplyEntity> replies;

    public List<ReplyEntity> getReplies() {
        return replies;
    }

    public void setReplies(List<ReplyEntity> replies) {
        this.replies = replies;
    }
}
