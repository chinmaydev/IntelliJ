package com.company;

import java.sql.Timestamp;

public class Notification {

    private String name;
    private Timestamp t;

    public Notification() {
    }

    public Notification(String name, Timestamp t) {
        this.name = name;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

