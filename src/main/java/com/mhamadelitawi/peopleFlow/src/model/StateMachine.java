package com.mhamadelitawi.peopleFlow.src.model;

public enum StateMachine {

    ADDED("ADDED"),
    IN_CHECK("IN-CHECK"),
    APPROVED("APPROVED") ,
    ACTIVE("ACTIVE");

    public String status;
    StateMachine(String value)
    {
        status = value;
    }

}
