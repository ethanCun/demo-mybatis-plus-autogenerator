package com.ethan.demomo.mp.controller;


import com.ethan.demomo.mp.entity.User;
import com.ethan.demomo.mp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author czy
 * @since 2021-04-18
 */
@RestController
@RequestMapping("/mp/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list")
    public List<User> list(){
        return this.userService.list();
    }
}
