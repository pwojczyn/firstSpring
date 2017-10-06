package com.pwojczyn.firstSpring.models.forms;

public class SimpleRestForm {
    private String login;
    private String message;

    public SimpleRestForm(String login, String message) {
        this.login = login;
        this.message = message;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
