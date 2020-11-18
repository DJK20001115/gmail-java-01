package com.galaxy.gmall.usermanage.service;

import com.galaxy.gmall.usermanage.bean.UserInfo;

import java.util.List;

public interface IUserInfoService {

    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);

}
