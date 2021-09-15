package com.biyi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Administrator by li tan
 * @date 2021/9/14 16:48
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * 创建一个对象，这个对象会扫描com.biyi包下的所有标记了RestController的类
     * @return 对象
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.biyi"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("比翼作业api文档")
                .description("比翼作业api文档")
//                .termsOfServiceUrl("/")
                .version("1.0")
                .build();
    }
}
