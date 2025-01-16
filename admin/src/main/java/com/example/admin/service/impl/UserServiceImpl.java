package com.example.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.example.admin.common.convention.exception.ClientException;
import com.example.admin.dao.entity.UserDO;
import com.example.admin.dao.mapper.UserMapper;
import com.example.admin.dto.resp.UserRespDTO;
import com.example.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import static com.example.admin.common.convention.errorcode.BaseErrorCode.CLIENT_ERROR;

/**
 * 用户实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements IUserService {

    @Override
    public UserRespDTO getUserById(Integer id) {
        UserDO userDO = lambdaQuery().eq(UserDO::getId, id).one();
        if (userDO == null) {
            throw new ClientException(CLIENT_ERROR);
        }
        UserRespDTO res = new UserRespDTO();
        BeanUtil.copyProperties(userDO,res);
        return res;
    }
}
