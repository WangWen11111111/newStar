package com.example.admin.dto.resp;

import com.example.admin.util.serialize.PhoneDesensitizationSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * 用户查询请求参数
 */
@Data
public class UserRespDTO {
    /**
     * 手机号
     */
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * 生成风格  0：随机  1：简笔画
     */
    private Byte style;
}


