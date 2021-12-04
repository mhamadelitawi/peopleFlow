package com.mhamadelitawi.peopleFlow.src.model;

public class StatusParam {

    private String name;
    private StateMachine status;

    public StatusParam() {
    }

    public StatusParam(String name) {
        this.name = name;
    }

    public StateMachine getStatus() {
        return status;
    }

    public void setStatus(StateMachine status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
