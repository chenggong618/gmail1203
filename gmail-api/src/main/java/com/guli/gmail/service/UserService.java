package com.guli.gmail.service;

import com.guli.gmail.beans.UmsMember;
import com.guli.gmail.beans.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getRececiveAddressByMemberId(String memberId);
}
