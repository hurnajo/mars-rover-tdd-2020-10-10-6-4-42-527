package com.afs.tdd.enums;

public enum RoverAction {
    MOVE("M"),
    LEFT("L"),
    RIGHT("R");

    private String action;

    RoverAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
