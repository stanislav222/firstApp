package com.rest.controller;

import com.rest.dao.ClientDao;
import com.rest.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MainController {

    final ClientDao userDao;

    @Autowired
    public MainController(ClientDao userDao) {
        this.userDao = userDao;
    }

    // URL:
    // http://localhost:8080/testApp/users
    // http://localhost:8080/testApp/users.xml
    // http://localhost:8080/testApp/users.json
    @GetMapping(value = "/users", //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @Valid
    public List<Client> getEmployees() {
        List<Client> list = userDao.getAllEmployees();
        return list;
    }

}
