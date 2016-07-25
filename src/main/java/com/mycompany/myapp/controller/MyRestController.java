package com.mycompany.myapp.controller;

import com.mycompany.myapp.dto.MyDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by udoluweera on 6/7/16.
 */
@RestController
public class MyRestController {

    @RequestMapping("/hello/{player}")
    public MyDto message(@PathVariable String player) {

        return new MyDto("AAA","BBB");
    }


}
