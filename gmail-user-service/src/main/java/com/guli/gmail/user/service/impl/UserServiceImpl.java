package com.guli.gmail.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.guli.gmail.beans.UmsMember;
import com.guli.gmail.beans.UmsMemberReceiveAddress;
import com.guli.gmail.service.UserService;
import com.guli.gmail.user.mapper.UmsMemberMapper;
import com.guli.gmail.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UmsMemberMapper umsMemberMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> userMemberList = umsMemberMapper.selectAll();
        return userMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getRececiveAddressByMemberId(String memberId) {
        //属于通用mapper下的属性，在括号内部的泛型需要填充所需对象的bean文件
        //Example e = new Example(UmsMemberReceiveAddress.class);
        //将传递过来的参数对应到bean文件下的字段
        //e.createCriteria().andEqualTo("memberId",memberId);
        //List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);
        //通用mapper下根据外键查询的方法
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
