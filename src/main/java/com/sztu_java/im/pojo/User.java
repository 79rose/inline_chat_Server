package com.sztu_java.im.pojo;

public class User {
    private long id;
    private String username;
    private String password;
    private String image;
 
    public User() {
    }

    public User(long id, String username, String password, String image) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.image = image;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", image=" + image + ", password=" + password + ", username=" + username + "]";
    }

    // get set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
