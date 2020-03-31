package com.guli.gmail.service;

import com.guli.gmail.beans.PmsBaseAttrInfo;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id);
}
