package com.sheep.sheepmall.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sheep
 * @Date: 2024/10/09/19:14
 * @Description:
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(apiInfo());
    }

    private Info apiInfo() {
        Contact contact = new Contact()
                .name("sheep")
                .email("1507405355@qq.com")
                .url("https://github.com/wlsheep");

        return new Info()
                .title("Sheep Mall")
                .contact(contact)
                .termsOfService("https://www.baidu.com") // 用于定义服务的域名（跳转链接）
                .version("1.0")
                .description("sheep mall项目API文档");
    }
}
