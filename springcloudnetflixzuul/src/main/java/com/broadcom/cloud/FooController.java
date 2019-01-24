package com.broadcom.cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.apache.commons.lang.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang.RandomStringUtils.randomNumeric;


@Controller
public class FooController {

    @RequestMapping(method = RequestMethod.GET, value = "/foos/{id}")
    @ResponseBody // i know there is @restcontroller and i dont need it jerk :D
    public Foo findById(
            @PathVariable long id,
            HttpServletRequest request,
            HttpServletResponse response
    ){
        if (request.getHeader("Test") != null) {
            response.addHeader("Test", request.getHeader("Test"));
        }

        return new Foo(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }
}
