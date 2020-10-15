package com.afs.tdd;

import java.util.Arrays;

import static Constant.constant.*;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String heading;

    public MarsRover(int locationX, int locationY, String heading) {

        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split(""))
                .forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command) {
        if (command.equals("M")) {
            roverMovement();
        }
        if (command.equals("L")) {
            roverTurnLeft();
        }
        if (command.equals("R")) {
            roverTurnRight();
        }
    }

    private void roverTurnRight() {
        if (heading.equals(NORTH)) {
            heading = EAST;
        }
        if (heading.equals(SOUTH)) {
            heading = WEST;
        }
    }

    private void roverTurnLeft() {
        if (heading.equals(NORTH)) {
            heading = WEST;
        }
        if (heading.equals(SOUTH)) {
            heading = EAST;
        }
        if (heading.equals(EAST)) {
            heading = NORTH;
        }
    }

    private void roverMovement() {
        if (heading.equals(NORTH)) {
            locationY += 1;
        }
        if (heading.equals(SOUTH)) {
            locationY -= 1;
        }
        if (heading.equals(EAST)) {
            locationX += 1;
        }


    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getHeading() {
        return heading;
    }
}
