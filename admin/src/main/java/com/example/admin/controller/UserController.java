package com.example.admin.controller;


import com.example.admin.common.convention.result.Result;
import com.example.admin.common.convention.result.Results;
import com.example.admin.dto.resp.UserRespDTO;
import com.example.admin.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 */

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class UserController {

    /**
     * 根据id查询用户
     */
    private final IUserService userService;

    @GetMapping("/api/piexl/admin/v1/user/{id}")
    public Result<UserRespDTO> getUserById(@PathVariable Integer id) {
        return Results.success(userService.getUserById(id));
    }



}

