package com.guli.gmail.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guli.gmail.beans.PmsBaseCatalog1;
import com.guli.gmail.beans.PmsBaseCatalog2;
import com.guli.gmail.beans.PmsBaseCatalog3;
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

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        List<PmsBaseCatalog3> catalogs3 = catalogService.getCatalog3(catalog2Id);
        return catalogs3;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        List<PmsBaseCatalog2> catalogs2 = catalogService.getCatalog2(catalog1Id);
        return catalogs2;
    }

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1() {
       List<PmsBaseCatalog1> catalogs1 = catalogService.getCatalog1();
       return catalogs1;
    }
}
