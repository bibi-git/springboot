package org.bibi.boot02.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Author：Tom
 * Date：2017/7/27
 * Email：84048715@qq.com
 */
@Configuration
@ConfigurationProperties(prefix = "org.bibi")
public class ConfigBean {

    private String username;

    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
