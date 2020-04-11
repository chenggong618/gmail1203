package com.guli.gmail.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guli.gmail.beans.PmsBaseAttrInfo;
import com.guli.gmail.beans.PmsBaseAttrValue;
import com.guli.gmail.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {
    @Reference
    AttrService attrService;


    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        //尚且存在重复点击事件的问题暂未解决
        String success = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return "true";
    }

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
       List<PmsBaseAttrInfo> attrInfoList =  attrService.getAttrInfoList(catalog3Id);
        return attrInfoList;
    }

    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        List<PmsBaseAttrValue> pmsBaseAttrValues =  attrService.getAttrValueList(attrId);
        return pmsBaseAttrValues;
    }

}
