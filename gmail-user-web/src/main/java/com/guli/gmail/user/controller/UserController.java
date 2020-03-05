package com.guli.gmail.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.guli.gmail.beans.UmsMember;
import com.guli.gmail.beans.UmsMemberReceiveAddress;
import com.guli.gmail.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    /*@Reference是dubbo远程注入代理*/
    @Reference
    UserService userService;

    @RequestMapping("getRececiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getRececiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses= userService.getRececiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> userMembers = userService.getAllUser();
        return userMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hellow user";
    }
}
