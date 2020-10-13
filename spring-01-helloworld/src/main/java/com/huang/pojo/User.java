package com.huang.pojo;

/**
 * @author :huangao
 */
public class User {


    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
