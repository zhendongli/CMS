package com.huazhu.application.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

@Configuration
public class PageHelperConfig {
	
	//配置mybatis的分页插件pageHelper
	@Bean
    public PageHelper pageHelper(){
		PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        //配置mysql数据库的方言
        properties.setProperty("dialect","mysql");    
        pageHelper.setProperties(properties);
        return pageHelper;
   }     

}