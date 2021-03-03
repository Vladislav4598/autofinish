package ru.practica.jjp;

import javax.annotation.Nullable;

import org.json.JSONObject;

public class User {

    public int id;
    public String userName;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String phone;
    public int userStatus;

    public User(

        @Nullable int id,
        @Nullable String userName,
        @Nullable String firstName,
        @Nullable String lastName,
        @Nullable String email,
        @Nullable String password,
        @Nullable String phone,
        @Nullable int userStatus

    ) {

        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
        
    }


    public JSONObject getJson(){
        return new JSONObject().put("id", this.id)
        .put("userName", this.userName)
        .put("firstName", this.firstName)
        .put("lastName", this.lastName)
        .put("email", this.email)
        .put("password", this.password)
        .put("phone", this.phone)
        .put("userStatus", this.userStatus);    
    }

}
