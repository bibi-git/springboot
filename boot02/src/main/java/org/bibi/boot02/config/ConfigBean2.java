package org.bibi.boot02.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Author：Tom
 * Date：2017/7/27
 * Email：84048715@qq.com
 */
@Configuration
@PropertySource("classpath:config/config.properties")
@ConfigurationProperties(prefix = "org.bibi")
public class ConfigBean2 {

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
