package com.mhamadelitawi.peopleFlow.src.model;

public class StatusParam {

    private String  username;
    private StateMachine status;

    public StatusParam() {
    }

    public StatusParam(String username) {
        this.username = username;
    }

    public StateMachine getStatus() {
        return status;
    }

    public void setStatus(StateMachine status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
