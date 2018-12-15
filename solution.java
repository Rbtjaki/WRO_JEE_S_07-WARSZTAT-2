public class solution {

    int id = 0;

    public void setDesrciption(String desrciption) {
        this.desrciption = desrciption;
    }

    String created;

    public int getId() {
        return id;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }

    public String getDesrciption() {
        return desrciption;
    }

    public int getExercies_id() {
        return exercies_id;
    }

    public int getUsers_id() {
        return users_id;
    }

    String updated;

    public solution(int id, String created, String updated, String desrciption, int exercies_id, int users_id) {
        this.id = id;
        this.created = created;
        this.updated = updated;
        this.desrciption = desrciption;
        this.exercies_id = exercies_id;
        this.users_id = users_id;
    }

    String desrciption;
    int exercies_id;
    int users_id;
}
