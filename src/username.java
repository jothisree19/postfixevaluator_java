class UserAccount {

    private String username;
    private String userpassword;

    // Default constructor
    public UserAccount() {
        this.username = "joo";
        this.userpassword = "0000";
    }

    // Parameterized constructor
    public UserAccount(String username, String userpassword) {
        this.username = username;
        this.userpassword = userpassword;
    }

    // Setter methods
    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    // Login method
    public void login(String inputpassword) {
        if (this.userpassword.equals(inputpassword)) {
            System.out.println("Login valid for " + username);
        } else {
            System.out.println("Login invalid for " + username);
        }
    }
}

