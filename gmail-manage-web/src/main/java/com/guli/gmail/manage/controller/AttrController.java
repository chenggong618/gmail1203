package com.guli.gmail.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guli.gmail.beans.PmsBaseAttrInfo;
import com.guli.gmail.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {
    @Reference
    AttrService attrService;

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
       List<PmsBaseAttrInfo> attrInfoList =  attrService.getAttrInfoList(catalog3Id);
        return attrInfoList;
    }

}
