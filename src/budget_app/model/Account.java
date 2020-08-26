package budget_app.model;

public class Account {

    private String accountType;
    private int accountTotal;

    public Account(String accountType) {
        this.accountType = accountType;
        this.accountTotal = 0;
    }
}
