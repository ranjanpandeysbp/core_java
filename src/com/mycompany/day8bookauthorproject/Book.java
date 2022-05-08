package com.mycompany.day8bookauthorproject;

public class Book {
    long bookId;
    String bookTitle;
    String description;
    double price;
    AuthorModel auth;
    void setBookId(long bId)
    {
        bookId = bId;
    }
    void setBookTitle(String bTitle)
    {
        bookTitle = bTitle;
    }
    void setDescription(String desc)
    {
        description=desc;
    }
    void setPrice(double pri)
    {
        price = pri;
    }
    /*void setAuth()//Commented out this as it was not having any parameter
    {
        auth = new Author();
    }*/
    /*void setAuth(int aId, String aName)//Added 2 parameters
    {
        auth = new Author();//Should this be present along with line 8
        auth.setAuthorId(aId);
        auth.setAuthorName(aName);
    }*/
    void setAuth(AuthorModel authObj)
    {
        auth = authObj;
    }
    long getBookId()
    {
        return bookId;
    }
    String getBookTitle()
    {
        return bookTitle;
    }
    String getDescription()
    {
        return description;
    }
    double getPrice()
    {
        return price;
    }
    AuthorModel getAuth()
    {
        return auth;//Is this correct: Correct
    }
}
