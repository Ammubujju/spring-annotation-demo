package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigurableBean {
//creating bean for a movie class
    @Bean
    public Movie movieBean()
    {
        Movie mov=new Movie();
        mov.setActor(actorBean());
        return mov;
    }

//creating a bean for actor class
    @Bean
    public Actor actorBean()
    {
        return new Actor();

    }

}
