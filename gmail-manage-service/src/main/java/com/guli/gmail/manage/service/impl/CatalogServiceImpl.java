package com.guli.gmail.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guli.gmail.beans.PmsBaseCatalog1;
import com.guli.gmail.manage.mapper.PmsBaseCatalog1Mapper;
import com.guli.gmail.manage.mapper.PmsBaseCatalog2Mapper;
import com.guli.gmail.manage.mapper.PmsBaseCatalog3Mapper;
import com.guli.gmail.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog() {

        return pmsBaseCatalog1Mapper.selectAll();
    }
}
