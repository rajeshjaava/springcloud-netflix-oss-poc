package service.c.bean;

/**
 * @author RajeshThokala
 */
public class MessageBean {

    private String message;

    public MessageBean(String message) {
        this.message = message;
    }

    public MessageBean() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
