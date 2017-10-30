package com.example.jonathas.mysql;

/**
 * Created by Jonathas on 30/10/2017.
 */

public class Contatos {
    String name, user_name, user_pass;

    public Contatos(String name, String user_name, String user_pass) {
        this.name = name;
        this.user_name = user_name;
        this.user_pass = user_pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
}
