package budget_app.model;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    ArrayList<Account> userAccounts = new ArrayList();

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User {Name: " + firstName + " " + lastName + ", Email: " + email + "}";
    }


}
