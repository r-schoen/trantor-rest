package net.schoen.trantor.domains;


public class ReplyRequest {
    private Integer userId;
    private Integer threadId;
    private String body;

    public ReplyRequest() {}

    public ReplyRequest(final Integer userId, final Integer threadId, final String body) {
        this.userId = userId;
        this.threadId = threadId;
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
