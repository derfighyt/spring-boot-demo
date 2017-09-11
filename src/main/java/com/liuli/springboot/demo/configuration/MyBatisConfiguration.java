package com.liuli.springboot.demo.configuration;

import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * MyBatis 配置类，
 *
 * @author li.liu
 */
@Configuration
@MapperScan("com.liuli.springboot.demo.*.mapper")
@Slf4j
public class MyBatisConfiguration {

    @Bean
    public PageHelper pageHelper() {
        log.info("load page helper for mybatis");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
