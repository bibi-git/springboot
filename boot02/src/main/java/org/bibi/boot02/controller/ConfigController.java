package org.bibi.boot02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：Tom
 * Date：2017/7/27
 * Email：84048715@qq.com
 */
@RestController
@RequestMapping(value = "/config")
public class ConfigController {

    @Value("${org.bibi.username}")
    private String username;

    @Value("${org.bibi.email}")
    private String email;

    @Value("${org.bibi.content}")
    private String content;

    @GetMapping("")
    public String index(){
        return this.getClass().getSimpleName() + "：username=" + username + ",email=" + email + ", content：" + content;
    }
}
