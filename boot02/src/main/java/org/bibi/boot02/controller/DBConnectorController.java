package org.bibi.boot02.controller;

import org.bibi.boot02.util.DBConnector;
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
@RequestMapping(value = "/db_test")
public class DBConnectorController {

    @Autowired
    private DBConnector dbConnector;

    @GetMapping("")
    public String testDBConnector(){
        return dbConnector.configure();
    }
}
