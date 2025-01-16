package com.example.admin.service;

import com.example.admin.dao.entity.UserDO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.admin.dto.resp.UserRespDTO;

/**
 * 用户业务逻辑
 */
public interface IUserService extends IService<UserDO> {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    UserRespDTO getUserById(Integer id);
}
