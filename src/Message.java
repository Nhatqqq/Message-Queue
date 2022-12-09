public class Message {
    String person;
    String data;

    public Message() {
        this.data = "";
    }
    
    public Message(String data) {
        this.data = data;
    }

    public Message(String person, String data) {
        this.person = person;
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPerson() {
        return this.person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

}
