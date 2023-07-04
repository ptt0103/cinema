
package model;


public class User {
    private String username, password, name;
    private int userID, wallet, isAdmin;

    public User() {
    }
    
    public User(int userIdD, String username, String password, int wallet, String name, int isAdmin) {
        this.userID = userIdD;
        this.username = username;
        this.password = password;
        this.wallet = wallet;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    
}
