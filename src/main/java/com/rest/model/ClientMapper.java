package com.rest.model;


import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper<Client> {

    @Override
    public Client mapRow(ResultSet resultSet, int i) throws SQLException {
        Client client = new Client();
        client.setClientId(resultSet.getLong("id"));
        client.setClientName(resultSet.getString("user_name"));
        client.setTariff(resultSet.getString("tariff"));
        client.setBalance(resultSet.getInt("balance"));
        return client;
    }
}
