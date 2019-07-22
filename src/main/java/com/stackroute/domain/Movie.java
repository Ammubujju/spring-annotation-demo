package com.stackroute.domain;
import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Movie
{
    @Autowired
    public Actor actor;

//construtor with the name movie
    public Movie()
    {
    }

    public Actor getActor()
    {
        return actor;
    }

    @Autowired
    public void setActor(Actor actor)
    {
        this.actor = actor;
    }
//Arguments passed
    public Movie(Actor actor)
    {
        this.actor = actor;
    }
 //displaying information of actor
    public void display()
    {
        System.out.println("Actor information : "+actor.getName()+" : gender is :" +actor.getGender()+" : age is :" +actor.getAge());
    }

}
