package in.co.gorest.model;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class GoRestPojo {
    private String Name;
    private String gender;
    private String email;
    private String status;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

