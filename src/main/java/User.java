public class User {
    private int id;
    private String status;
    private String personalInfo;

    public User(int id, String status, String personalInfo) {
        this.id = id;
        this.status = status;
        this.personalInfo = personalInfo;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}

