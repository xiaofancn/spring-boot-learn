package org.snailteam.cloud.zookeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private FeignConsumerClient feignConsumerClient;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestParam(value = "id") Long id) {
        return feignConsumerClient.getUser(id);
    }
}