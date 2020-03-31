package com.guli.gmail.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guli.gmail.beans.PmsBaseAttrInfo;
import com.guli.gmail.manage.mapper.PmsBaseAttrInfoMapper;
import com.guli.gmail.manage.mapper.PmsBaseAttrValueMapper;
import com.guli.gmail.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo>  attrInfoList= pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return attrInfoList;
    }
}
