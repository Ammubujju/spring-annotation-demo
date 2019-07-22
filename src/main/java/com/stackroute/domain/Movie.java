package com.stackroute.domain;
import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//creating object for actor class 
public class Movie
{
    @Autowired
    public Actor actor;


    public Movie()
    {
    }
//using getter
    public Actor getActor()
    {
        return actor;
    }
//using setter
    @Autowired
    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    public Movie(Actor actor)
    {
        this.actor = actor;
    }
//displaying information
    public void display()
    {
        System.out.println("Actor information : "+actor.getName()+" : gender is :" +actor.getGender()+" : age is :" +actor.getAge());
    }

}
