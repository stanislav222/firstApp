package com.rest.dao;

import com.rest.model.Client;
import com.rest.model.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class ClientDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ClientDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Client> getAllEmployees() {
        return jdbcTemplate.query("select* from test_user", new ClientMapper());
    }

}
