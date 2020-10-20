package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarseRoverTest {
    @Test
    void should_return_x_0_y_1_heading_N_when_execute_given_x_0_y_0_heading_N_and_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandReciever commandReciever = new CommandReciever(marsRover);
        String command = "MLMR";
        //when
        commandReciever.sendCommand(command);
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_W_when_execute_given_x_0_y_0_heading_N_and_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandReciever commandReciever = new CommandReciever(marsRover);
        String command = "L";
        //when
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_E_when_execute_given_x_0_y_0_heading_N_and_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandReciever commandReciever = new CommandReciever(marsRover);

        //when
        String command = "R";
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_negative_1_heading_S_when_execute_given_x_0_y_0_heading_S_and_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        String command = "M";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_E_when_execute_given_x_0_y_0_heading_S_and_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        String command = "L";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_W_when_execute_given_x_0_y_0_heading_S_and_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        String command = "R";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getHeading());
    }

    @Test
    void should_return_x_1_y_0_heading_E_when_execute_given_x_0_y_0_heading_E_and_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
      ;
        String command = "M";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_N_when_execute_given_x_0_y_0_heading_E_and_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        String command = "L";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_S_when_execute_given_x_0_y_0_heading_E_and_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        String command = "R";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getHeading());
    }

    @Test
    void should_return_x_negative_one_y_0_heading_W_when_execute_given_x_0_y_0_heading_W_and_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        String command = "M";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_S_when_execute_given_x_0_y_0_heading_W_and_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        String command = "L";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_N_when_execute_given_x_0_y_0_heading_W_and_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        //when
        String command = "R";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

    @Test
    void should_return_commandNotDefinedException_when_executed_given_0_0_N_and_command_F() throws CommandNotDefinedException {
        //given
        String command = "P";
        //when
        MarsRover marsRover = new MarsRover(0, 0, "N");
        CommandReciever commandReciever = new CommandReciever(marsRover);
        //then
        assertThrows(CommandNotDefinedException.class, () -> commandReciever.sendCommand(command));
    }

    @Test
    void should_return_x_negative_1_y_1_heading_N_when_execute_given_x_0_y_0_heading_N_and_command_MLMR() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        String command = "MLMR";
        CommandReciever commandReciever = new CommandReciever(marsRover);
        commandReciever.sendCommand(command);
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }

}
