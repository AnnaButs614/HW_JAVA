package HW_1;

public class Comments {
    int userId;
    int id;
    String email;
    String name;
    String body;

    public Comments(){

    }

    public Comments(int userId, int id, String email, String name, String body){
        this.userId = userId;
        this.id = id;
        this.email = email;
        this.name = name;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "userId=" + userId +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
