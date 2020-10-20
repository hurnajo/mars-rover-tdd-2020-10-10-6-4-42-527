package com.afs.tdd;

public class CommandNotDefinedException extends Exception {
    CommandNotDefinedException(){
        super("Invalid Command");
    }
}
