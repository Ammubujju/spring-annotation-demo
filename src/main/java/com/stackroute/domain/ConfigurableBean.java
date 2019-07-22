package com.stackroute.domain;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
//Indicates that a class declares one or more @Bean method
@Configuration
public class ConfigurableBean
{
    @Bean(name = "actor")
    public Actor getActor()
    {
        return new Actor("Prabhas","Male",40);
    }
        // instantiate, configure and return bean ...

    @Bean(name="movie")
    public Movie getMovie()
    {
        return new Movie();
    }
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean setBeanlifeCycleobject()
    {
        return new BeanLifeCycleDemoBean();
    }
    @Bean
    public BeanPostProcessorDemoBean setBeanPostProcessorDemoBean()
    {
        return new BeanPostProcessorDemoBean();
    }

}
