package org.bibi.boot02.controller;

import org.bibi.boot02.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：Tom
 * Date：2017/7/27
 * Email：84048715@qq.com
 */
@RestController
@RequestMapping(value = "/config1")
public class Config1Controller {

    @Autowired
    private ConfigBean configBean;

    @GetMapping("")
    public String index(){
        return this.getClass().getSimpleName() + "：username=" + configBean.getUsername() + ",email=" + configBean.getEmail();
    }
}
