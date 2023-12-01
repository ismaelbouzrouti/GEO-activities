package GEOActivities.start;

import jakarta.persistence.*;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long UserId;

    private String userName;

    private String email;

    private String password;


    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
