package org.bibi.boot01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：Tom
 * Date：2017/7/27
 * Email：84048715@qq.com
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "Hello Spring Boot";
    }
}
