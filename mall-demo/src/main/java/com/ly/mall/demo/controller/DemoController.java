package com.ly.mall.demo.controller;

import com.ly.mall.common.api.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：DemoController
 * 功能说明：
 * TODO
 * ***********************************************************************
 *
 * @author 创建人：ly
 * @version 版本号：V1.0
 * **************************修订记录*************************************
 * <p>
 * 2019/12/21 15:23   ly   创建该类功能。
 * <p>
 * **********************************************************************
 * @date 创建日期：2019/12/21 15:23
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/hello")
    public Object hello(String name) {
        return CommonResult.success("hello " + name + " " + System.currentTimeMillis());
    }
}
