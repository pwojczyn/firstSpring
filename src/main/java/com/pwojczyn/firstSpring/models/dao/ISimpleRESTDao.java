package com.pwojczyn.firstSpring.models.dao;

import com.pwojczyn.firstSpring.models.forms.SimpleRestForm;

import java.util.List;

public interface ISimpleRESTDao {
    List<SimpleRestForm> getAllLoginData(String login);
    public void putLoginMessage(String login, String message);
}
