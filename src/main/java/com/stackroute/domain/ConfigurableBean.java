package com.stackroute.domain;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
//Indicates that a class declares one or more @Bean methods
@Configuration
public class ConfigurableBean
{
    // instantiate, configure and return bean ...
    @Bean(name = "actor")
    public Actor getActor()
    {
        return new Actor("Prabhas","Male",40);
    }
    @Bean(name="movie")
    public Movie getMovie()
    {
        return new Movie();
    }

}
