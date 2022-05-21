package vyas.LearnSpringBoot.Courses.Controller;

import org.springframework.stereotype.Component;

public class Course {
    int id;
    String name;
    String author;

    public Course(int id,String name,String author)
    {
        this.id= id;
        this.name=name;
        this.author=author;
    }
    @Override
    public String toString()
    {
        return "Course[id = " +id + "name " + name + "author " + author + "]";
    }
}
