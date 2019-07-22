package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
//implementing beanpostprocessor
public class BeanPostProcessorDemoBean implements BeanPostProcessor
{
//before initialization
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("Post Process After Initialization");
        return null;
    }
//after initialization
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("Post Process Before Initialization");
        return null;
    }
}
