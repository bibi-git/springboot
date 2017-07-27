package org.bibi.boot02.util;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Author：Tom
 * Date：2017/7/27
 * Email：84048715@qq.com
 * 开发环境数据库
 */
@Component
@Profile("dev")
public class DevDBConnector implements DBConnector{
    @Override
    public String configure() {
        return  this.getClass().getSimpleName() + "连接开发环境数据库";
    }
}
