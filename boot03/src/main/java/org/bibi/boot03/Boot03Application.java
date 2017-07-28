package org.bibi.boot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Author：Tom
 * Date：2017/7/27
 * Email：84048715@qq.com
 */
@SpringBootApplication
public class Boot03Application extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(Boot03Application.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(Boot03Application.class);
    }
}
