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






    public String getUserName() {
        return userName;
    }



    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }

}
