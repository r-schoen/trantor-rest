package net.schoen.trantor.domains;

import net.schoen.trantor.entities.ThreadEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

// todo: add replies
@XmlRootElement(name = "threads")
@XmlAccessorType(XmlAccessType.FIELD)
public class Threads implements Serializable {

    public Threads() {}

    public Threads(List<ThreadEntity> threads) {
        this.threads = threads;
    }

    @XmlElement(name = "thread")
    private List<ThreadEntity> threads;

    public List<ThreadEntity> getThreads() {
        return threads;
    }

    public void setThreads(List<ThreadEntity> threads) {
        this.threads = threads;
    }
}
