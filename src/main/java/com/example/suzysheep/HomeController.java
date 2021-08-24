package com.example.suzysheep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HomeController {
    @RequestMapping(value="/")
    @ResponseBody
    public String test(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        return "this is a test: " + req.getParameter("foo");
    }

}
