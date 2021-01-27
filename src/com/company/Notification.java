package com.company;

import java.sql.Timestamp;

public class Notification {

    private String name;
    private Timestamp t;
    private String feature;

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

    public Timestamp getT() {
        return t;
    }

    public void setT(Timestamp t) {
        this.t = t;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}

