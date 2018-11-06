package firebase_user;

public class User {
    private String userId;
    private String email;
    private String password;
    private String gender;
    private String age;
    private String city;
    private String firstName;
    private String lastName;
    private String pledge;

    public User() {

    }

    public User(String userId, String email, String password, String gender, String age,
                String city, String firstName, String lastName, String pledge) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pledge = pledge;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getPledge() {
        return pledge;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPledge(String pledge) {
        this.pledge = pledge;
    }
}
