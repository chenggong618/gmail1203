package com.guli.gmail.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guli.gmail.beans.PmsProductInfo;
import com.guli.gmail.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {
    @Reference
    SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfos=spuService.spuList(catalog3Id);
        return  pmsProductInfos;
    }
}
