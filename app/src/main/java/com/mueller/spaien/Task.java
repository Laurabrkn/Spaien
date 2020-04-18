package com.mueller.spaien;


public class Task {

    private int id;
    private String description;
    private boolean isRule;

    public Task (int id, String description, boolean isRule) {
        this.id = id;
        this.description = description;
        this.isRule = isRule;
    }

    public int getID() {

        return id;
    }

    public String getDescription(){

        return description;
    }

    public boolean getIsRule(){

        return isRule;
    }

}
