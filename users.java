public class users {

    public users(int id, String username, String email, String password, int user_id) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.user_id = user_id;
    }
    int id = 0;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String username;
    String email;
    String password;
    int user_id;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public users(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getUser_id() {
        return user_id;
    }
}
