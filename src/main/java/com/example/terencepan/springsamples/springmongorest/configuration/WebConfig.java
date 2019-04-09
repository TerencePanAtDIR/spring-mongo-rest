package com.example.terencepan.springsamples.springmongorest.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("/webjars/");
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
        registry.addResourceHandler("/static/css/**")
                .addResourceLocations("/static/css/");
    }
}
