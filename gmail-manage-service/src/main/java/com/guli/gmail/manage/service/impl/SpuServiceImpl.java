package com.guli.gmail.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guli.gmail.beans.PmsProductInfo;
import com.guli.gmail.manage.mapper.PmsProductInfoMapper;
import com.guli.gmail.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;
    //查询spu
    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);
        List<PmsProductInfo> pmsProductInfos = pmsProductInfoMapper.select(pmsProductInfo);
        return pmsProductInfos;
    }
}
