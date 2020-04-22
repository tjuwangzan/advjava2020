import anoot.Column;
import anoot.Table;

@Table("user")
public class User {
    @Column("id")
    private int id = -1;

    @Column("username")
    private String username = null;

    @Column("age")
    private int age = -1;

    @Column("email")
    private String email = null;

    @Column("telephone")
    private String telephone = null;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
