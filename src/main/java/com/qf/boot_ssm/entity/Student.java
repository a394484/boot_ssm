package com.qf.boot_ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Student {

//    @NotNull
    private int id;
//    @NotNull(message = "用户名不能为空")
//    private String name;

}
