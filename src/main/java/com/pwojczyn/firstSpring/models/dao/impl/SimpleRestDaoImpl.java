package com.pwojczyn.firstSpring.models.dao.impl;

import com.pwojczyn.firstSpring.models.MysqlConnector;
import com.pwojczyn.firstSpring.models.dao.ISimpleRESTDao;
import com.pwojczyn.firstSpring.models.forms.SimpleRestForm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SimpleRestDaoImpl implements ISimpleRESTDao {
    private MysqlConnector connector = MysqlConnector.getInstance();
    @Override
    public List<SimpleRestForm> getAllLoginData(String login) {
        List<SimpleRestForm> loginMessageList = new ArrayList<>();

        try (PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
                "SELECT * FROM simpleREST WHERE login = ?")) {
            preparedStatement.setString(1,login);
            ResultSet set = preparedStatement.executeQuery();
            while(set.next()){
                loginMessageList.add(new SimpleRestForm(set.getString("login"),set.getString("message")));

            }
            return loginMessageList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public void putLoginMessage(String login, String message) {

    }
}
