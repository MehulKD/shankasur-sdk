package com.shankasur.ecommerce.model;

public class UserAccount
{
    private long useraccountid;
    private String username;
    private String password;
    private String emailid;
    private String contactnumber;
    private Role role;

    public UserAccount(){

    }
    public UserAccount(String username,String password,String emailid,String contactnumber,Role role) {
        this.username=username;
        this.password=password;
        this.emailid=emailid;
        this.contactnumber=contactnumber;
        this.role=role;
    }

    public long getUseraccountid() {
        return useraccountid;
    }
    public void setUseraccountid(long useraccountid) {
        this.useraccountid = useraccountid;
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

    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getContactnumber() {
        return contactnumber;
    }
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return username;
    }
    public Role getRole() {
        return role;
    }
}
