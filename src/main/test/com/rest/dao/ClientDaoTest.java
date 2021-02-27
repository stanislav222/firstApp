package com.rest.dao;

import com.rest.model.Client;
import junit.framework.TestCase;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.ArrayList;

public class ClientDaoTest extends TestCase {

    @Mock
    JdbcTemplate jdbcTemplate;

    @Mock
    ClientDao clientDao;

    public void testGetAllEmployees() {/*
        Mockito.doReturn(new ArrayList<Client>())
                .when(clientDao)
                .getAllEmployees();*/
    }
}