package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qixin on 2018/1/21.
 */
@RestController
public class Controller {

    @GetMapping("person/{id}")
    public String getPerson(@PathVariable("id") Integer id, HttpServletRequest request) {
        return "id = " + id + " ,request = " + request.getRequestURL().toString();
    }
}
