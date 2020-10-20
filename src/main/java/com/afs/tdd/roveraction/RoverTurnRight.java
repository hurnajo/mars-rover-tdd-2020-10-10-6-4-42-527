package com.afs.tdd.roveraction;

import com.afs.tdd.iCommandExecutor;
import com.afs.tdd.iRoverActionCommand;

public class RoverTurnRight implements iCommandExecutor {
    iRoverActionCommand roverActionCommand;

    public RoverTurnRight(iRoverActionCommand roverActionCommand){
        this.roverActionCommand = roverActionCommand;
    }

    @Override
    public void execute() {
        roverActionCommand.turnright();
    }
}
