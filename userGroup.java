public class userGroup {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id = 0;

    public userGroup(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;

}
