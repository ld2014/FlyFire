package com.flyfire.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.ResourceUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;



/**
 * velocity 1.4 版本以后不支持 手动加载velocity 方式
 * 加载 Velocity 配置类
 */

public class WebMvcConfig extends WebMvcConfigurerAdapter {


    //配置velocity配置bean
    @SuppressWarnings("deprecation")
    @Bean
    public VelocityConfigurer velocityConfigurer(ApplicationContext context) throws IOException {
        VelocityConfigurer config = new VelocityConfigurer();

        config.setConfigLocation(new ClassPathResource("velocity.properties"));
        return config;
    }

    //配置velocity视图解析器
    @SuppressWarnings("deprecation")
    @Bean
    public VelocityViewResolver velocityResolver() throws FileNotFoundException {
        VelocityViewResolver resolver = new VelocityViewResolver();
        resolver.setCache(false);
        //设置视图路径前缀
        resolver.setPrefix("/static/");

        //设置视图路径后缀
        resolver.setSuffix(".html");
        resolver.setContentType("text/html;charset=utf-8");
        resolver.setExposeSpringMacroHelpers(true);
        resolver.setExposeRequestAttributes(true);

        //设置RequestContext在视图页面中的变量名,以便使用${request}获取
        resolver.setRequestContextAttribute("rc");

        //加载 velocity 内部自带工具类
        String toolbox = WebMvcConfig.class.getClassLoader().getResource("toolbox.xml").getPath();
        resolver.setToolboxConfigLocation(toolbox);
        resolver.setViewClass(VelocityLayoutToolboxView.class);// toolbox 为了缩减和美观配置文件 手动实现 createVelocityContext

        //resolver.setToolboxConfigLocation("toolbox.xml");
        return resolver;
    }



    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(
                Charset.forName("UTF-8"));
        return converter;
    }

    @Override
    public void configureMessageConverters(
            List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
    }

    @Override
    public void configureContentNegotiation(
            ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }
}
