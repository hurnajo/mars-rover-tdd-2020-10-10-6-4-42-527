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
        else if (heading.equals(SOUTH)) {
            heading = WEST;
        }
        else if (heading.equals(EAST)) {
            heading = SOUTH;
        }
    }

    private void roverTurnLeft() {
        if (heading.equals(NORTH)) {
            heading = WEST;
        }
        else if (heading.equals(SOUTH)) {
            heading = EAST;
        }
        else if (heading.equals(EAST)) {
            heading = NORTH;
        }
    }

    private void roverMovement() {
        if (heading.equals(NORTH)) {
            locationY += 1;
        }
        else if (heading.equals(SOUTH)) {
            locationY -= 1;
        }
        else if (heading.equals(EAST)) {
            locationX += 1;
        }
        else if (heading.equals(WEST)) {
            locationX -= 1;
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
