package com.mao.config;

import com.mao.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：指明当前类是一个配置类；就是来替代spring的配置文件
 *
 */
@Configuration
public class MyAppConfig {

    //将方法的返回添加到组件中；容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@bean给容器中添加组件了。。。");
        return new HelloService();
    }
}
