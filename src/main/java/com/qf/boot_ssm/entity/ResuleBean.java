package com.qf.boot_ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResuleBean<T> {
    private String respCode;
    private T data;

}
