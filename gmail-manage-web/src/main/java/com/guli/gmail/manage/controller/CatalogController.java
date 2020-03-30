package com.guli.gmail.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guli.gmail.beans.PmsBaseCatalog1;
import com.guli.gmail.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@CrossOrigin
public class CatalogController {
    @Reference
    CatalogService catalogService;
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1() {
       List<PmsBaseCatalog1> catalogs = catalogService.getCatalog();
       return catalogs;
    }
}
