package com.broadcom.cloud;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetflixZuulProxyTest {

    @Test
    public void whenSendToRequestFooResource_thenOK() {
        Response response = RestAssured.get("http://localhost:8080/foos/1");

        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void whenSendRequest_thenHeaderAdded() {
        Response response = RestAssured.get("http://localhost:8080/foos/1");

        assertEquals(200, response.getStatusCode());
        assertEquals("TestSample", response.getHeader("Test"));
    }
}
