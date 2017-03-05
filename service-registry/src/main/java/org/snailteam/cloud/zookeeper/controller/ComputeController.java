package org.snailteam.cloud.zookeeper.controller;

import java.util.Date;

import org.snailteam.cloud.zookeeper.vo.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/show", method = {RequestMethod.POST})
    @ResponseBody
    public UserDTO show(@RequestParam(value="id") Long id) {
        ServiceInstance instance = client.getLocalServiceInstance();
        UserDTO dto = new UserDTO();
        dto.setId(id);
        dto.setName("scott");
        dto.setBirthday(new Date());
        return dto;
    }

}