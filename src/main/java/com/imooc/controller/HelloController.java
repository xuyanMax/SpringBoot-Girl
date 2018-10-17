package com.imooc.controller;

import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.properties.GirlProperties;
import com.imooc.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2016-10-30 23:36
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        if (true)
            throw new GirlException(ResultEnum.SUCCESS);
        else
            return "id: " + myId;
//        return girlProperties.getCupSize();
    }
}
