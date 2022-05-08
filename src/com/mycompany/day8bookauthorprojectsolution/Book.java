package com.mycompany.day8bookauthorprojectsolution;

public class Book {
    long bookId;
    String bookTitle;
    String description;
    double price;
    Author author;
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
    void setAuthor(Author authObj)
    {
        author = authObj;
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
    Author getAuthor()
    {
        return author;//Is this correct: Correct
    }
}
