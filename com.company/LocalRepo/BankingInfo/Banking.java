package BankingInfo;

class Account {
    private String name;
    protected String email;
    private String password;

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for password
    public String getPassword() {
        return this.password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}

public class Banking {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("John");
        a.email = "John@example.com";
        a.setPassword("abc@123");

        System.out.println(a.getPassword());
    }
}
