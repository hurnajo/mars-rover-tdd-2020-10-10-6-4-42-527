package com.afs.tdd.roveraction;

import com.afs.tdd.iCommandExecutor;
import com.afs.tdd.iRoverActionCommand;

public class Move implements iCommandExecutor {

    private iRoverActionCommand RoverActionCommand;
    public Move(iRoverActionCommand roverActionCommand)
    {this.RoverActionCommand = roverActionCommand;
    }

    @Override
    public void execute() {
        RoverActionCommand.move();
    }
}
