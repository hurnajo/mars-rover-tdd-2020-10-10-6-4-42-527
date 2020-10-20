package com.afs.tdd;

import static constant.Constant.*;

public class MarsRover implements iRoverActionCommand {

    private int locationX;
    private int locationY;
    String heading;

    public MarsRover(int locationX, int locationY, String heading) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
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

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getHeading() {
        return heading;
    }

    @Override
    public void move() {
        if (heading.equals(EAST) || heading.equals(WEST)) {
            newlocationX(heading);
        }
        if (heading.equals(NORTH) || heading.equals(SOUTH)) {
            newlocationY(heading);
        }
    }

    @Override
    public void turnleft() {
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

    @Override
    public void turnright() {
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
}
