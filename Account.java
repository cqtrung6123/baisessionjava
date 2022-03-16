package bankingapplication;

public class Account {
    //create private fields
    private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Account(){}
    @Override
    public String toString(){
        //overide the inherited tostring() method to display user id and password
        return "Account{" + "userId=" + userId + ",password" + password +'}';

    }
}
