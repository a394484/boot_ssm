package com.qf.boot_ssm.exceptionHandler;

import com.qf.boot_ssm.entity.ResuleBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//@ControllerAdvice
public class exceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResuleBean handlerException(Exception e){
        return  new ResuleBean("500",e.getMessage());

        //自定义返回内容
//        return  new ResuleBean("500","自定义错误消息");
    }
}
