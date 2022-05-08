package com.mycompany.day8bookauthorproject;

public class AuthorModel {//POJO Class: Plain Old Java Object: Using Setter and Getter methods// Container Class
    int authorId;
    String authorName;
    void setAuthorId(int authId)
    {
        authorId = authId;
    }
    void setAuthorName(String authName)
    {
        authorName = authName;
    }
    int getAuthorId()
    {
        return authorId;
    }
    String getAuthorName()
    {
        return authorName;
    }
}
