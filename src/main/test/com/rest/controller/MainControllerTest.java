package com.rest.controller;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class MainControllerTest extends TestCase {

    @Autowired
    private MainController controller;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {
      /*  mockMvc.perform((RequestBuilder) post("http://localhost:8080/testApp/users.json")
                .contentType(MediaType.valueOf("application/json")))
                .andExpect(status().isOk());*/
    }
}