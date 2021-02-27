package com.rest.model;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class ClientTest {

    @Test
    public void whenNonPublicField() {
        Client client = new Client();
        ReflectionTestUtils.setField(client, "clientId", 1L);
        Assert.assertEquals(1L, (long) client.getClientId());
    }
}