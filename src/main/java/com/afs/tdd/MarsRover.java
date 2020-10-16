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
        Arrays.asList(commands.split("")).forEach(command -> {
            try {
                executeCommand(command);
            } catch (CommandNotDefinedException e) {
                e.printStackTrace();
            }
        });
    }

    public void executeCommand(String command) throws CommandNotDefinedException {
        if (command.equals(MOVE_FORWARD)) {
            roverMovement();
        } else if (command.equals(TURN_LEFT)) {
            roverTurnLeft();
        } else if (command.equals(TURN_RIGHT)) {
            roverTurnRight();
        } else {
            throw new CommandNotDefinedException(INVALID_MOVEMENT);
        }
    }

    private void roverTurnRight() {
        if (heading.equals(NORTH)) {
            heading = EAST;
        } else if (heading.equals(SOUTH)) {
            heading = WEST;
        } else if (heading.equals(EAST)) {
            heading = SOUTH;
        } else if (heading.equals(WEST)) {
            heading = NORTH;
        }
    }

    private void roverTurnLeft() {
        if (heading.equals(NORTH)) {
            heading = WEST;
        } else if (heading.equals(SOUTH)) {
            heading = EAST;
        } else if (heading.equals(EAST)) {
            heading = NORTH;
        } else if (heading.equals(WEST)) {
            heading = SOUTH;
        }
    }

    private void roverMovement() {
        if (isCoordinateX()) {
            newlocationX(heading);
        }
        if (isCoordinateY()) {
            newlocationY(heading);
        }
    }

    private void newlocationX(String heading) {
        if (heading.equals(EAST)) {
            locationX++;
        }
        if (heading.equals(WEST)) {
            locationX--;
        }
    }

    private void newlocationY(String heading) {
        if (heading.equals(NORTH)) {
            locationY++;
        }
        if (heading.equals(SOUTH)) {
            locationY--;
        }
    }

    private boolean isCoordinateX() {
        return heading.equals(EAST) || heading.equals(WEST);
    }

    private boolean isCoordinateY() {
        return heading.equals(NORTH) || heading.equals(SOUTH);
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
