package com.afs.tdd;

import java.util.Arrays;

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
                .forEach(command->this.executeCommand(command));
    }

    private void executeCommand(String command){
        if(command.equals("M")){
            roverMovement();
        };
    }

    private void roverMovement() {
        if(heading.equals("N")){
            locationY +=1;
        }
    }

    public int getLocationX() {
        return 0;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getHeading() {
        return heading;
    }
}
