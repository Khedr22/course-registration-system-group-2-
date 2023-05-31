package Backed;

public abstract class User {

    private String name;
    private String id;
    private String Address;
    private String Gender;
    private String email;
    private String password;
    private int phonenumber;

    public User(String name, String id, String Address, String Gender, String email, String password, int phonenumber) {
        this.name = name;
        this.id = id;
        this.Address = Address;
        this.Gender = Gender;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
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

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public abstract void display();

}
