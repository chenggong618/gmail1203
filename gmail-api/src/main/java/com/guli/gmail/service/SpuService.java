package com.guli.gmail.service;

import com.guli.gmail.beans.PmsProductInfo;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
