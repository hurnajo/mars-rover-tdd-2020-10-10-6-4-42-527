package com.afs.tdd;

import com.afs.tdd.roveraction.Move;

import com.afs.tdd.enums.RoverAction;
import com.afs.tdd.roveraction.RoverTurnLeft;
import com.afs.tdd.roveraction.RoverTurnRight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandReciever {
    Map<String, iCommandExecutor> commandActionMap = new HashMap<>();
    CommandInvoker commandInvoker;

    public CommandReciever(MarsRover marsRover) {
        commandActionMap.put(RoverAction.MOVE.getAction(),new Move(marsRover));
        commandActionMap.put(RoverAction.RIGHT.getAction(), new RoverTurnRight(marsRover));
        commandActionMap.put(RoverAction.LEFT.getAction(), new RoverTurnLeft(marsRover));
    }

    private void validateCommand(String command) throws CommandNotDefinedException {
        if (Arrays.stream(RoverAction.values()).anyMatch(roverAction -> command.contains(roverAction.getAction()))) {
            return;
        }
        throw new CommandNotDefinedException();
    }

    public void sendCommand(String commands) throws CommandNotDefinedException {
        validateCommand(commands);
        String[] commandList = commands.split("");
        for (String command : commandList) {
            commandInvoker = new CommandInvoker(commandActionMap.get(command));
            commandInvoker.executeAction();
        }
    }
}
