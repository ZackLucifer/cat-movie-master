package com.ctgu.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/**
 * author:Zack
 * using: It is a tool for getting bean without spring enviroment
 * */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.context = applicationContext;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
