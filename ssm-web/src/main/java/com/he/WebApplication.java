package com.he;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class WebApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    /**
     * 在Servlet容器中部署WAR的时候，不能依赖于Application的main函数而是要以类似于web.xml文件配置的方式来启动Spring应用上下文<br/>
     * 所以此时需要声明这样一个类或者将应用的主类改为继承SpringBootServletInitializer也可以
     *
     * @author wujing
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebApplication.class);
    }
}
