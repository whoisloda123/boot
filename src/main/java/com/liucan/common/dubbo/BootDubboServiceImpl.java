package com.liucan.common.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.liucan.service.UserInfoMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liucan
 * @date 2018/8/5
 * @brief dubbo服务类
 */
@Component
@Service(version = "1.1.0")
public class BootDubboServiceImpl implements IBootDubboService {
    @Autowired
    private UserInfoMybatis userInfoMybatis;

    @Override
    public String getUserName(Integer userId) {
        return userInfoMybatis.getUserPhone(userId).toString();
    }
}