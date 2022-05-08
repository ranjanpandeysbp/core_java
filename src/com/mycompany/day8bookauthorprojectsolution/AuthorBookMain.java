package com.mycompany.day8bookauthorprojectsolution;

import java.util.Scanner;

public class AuthorBookMain {

    static Scanner sc = new Scanner(System.in);
    static int choice;

    public static void menu(){
        System.out.println("Please enter a value from the below list of available options:");
        System.out.println("0: Enter number of books and authors");
        System.out.println("1: Add authors");
        System.out.println("2: Add books");
        System.out.println("3: Search a book by book name");
        System.out.println("4: Display a book details");
        System.out.println("5: Display an author details");
        System.out.println("6: Display all books");
        System.out.println("7: Display all authors");
        System.out.println("8: Update an author");
        System.out.println("9: Delete an author");
        System.out.println("10: Update a book: Through choice");
        System.out.println("11: Update a book: All Fields");
        System.out.println("12: Delete a book");
        System.out.println("99: Exit Program");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        sc.nextLine();//is this correct
        //Scanner abc = new Scanner(System.in);
        //abc.nextLine();
    }

    public static void main(String[] args){
        Book books[] = null;
        Book book = null;//Variable 'book' initializer 'null' is redundant
        Author authors[] = null;
        Author author = null;//Created the reference//Why is this null in gray color: //Variable 'author' initializer 'null' is redundant
        int noOfAuthors = 0;
        int noOfBooks = 0;
        while(true)
        {
            menu();
            switch(choice)
            {
                case 0:
                    System.out.println("Enter the number of Authors you want");
                    noOfAuthors = sc.nextInt();
                    authors = new Author[noOfAuthors];
                    System.out.println("Enter the number of Books you want");
                    noOfBooks = sc.nextInt();
                    books = new Book[noOfBooks];
                    break;
                case 1:
                    System.out.println("Add "+noOfAuthors+" Author details");
                    //Create object of Author and add to the author array
                    for (int i = 0; i<noOfAuthors; i++)
                    {
                        System.out.println("Enter author ID");
                        int authorId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter author name");
                        String authorName = sc.nextLine();
                        author = new Author();
                        author.setAuthorId(authorId);
                        author.setAuthorName(authorName);
                        authors[i] = author;//doubt, can we directly set the author[i]
                    }
                    break;
                case 2:
                    System.out.println("Add "+noOfBooks+" Book details");
                    //Create object of Book and add to the book array
                    for (int i = 0;i<noOfBooks;i++)
                    {
                       System.out.println("Enter Book ID");
                       int bookId = sc.nextInt();
                       sc.nextLine();
                       System.out.println("Enter Book name");
                       String bookTitle = sc.nextLine();
                       System.out.println("Enter Book Description");
                       String description = sc.nextLine();
                       System.out.println("Enter book price");
                       double price = sc.nextDouble();
                       // Display User all available authors and ask to choose one author
                       System.out.println("Available authors");
                       System.out.println("----------------------------------------------------");
                       for(Author a : authors)
                       {
                            System.out.println("Author ID : "+a.getAuthorId());
                            System.out.println("Author Name is : "+a.getAuthorName());
                            System.out.println("----------------------------------------------------");
                       }
                       System.out.println("Enter the author Id of the author for this book");
                       int authId = sc.nextInt();
                       //System.out.println(authId);
                       Author tempAuthor = null;
                       for(Author a: authors)
                       {
                           //System.out.println(a.getAuthorId());
                           if(a.getAuthorId()==authId)
                           {
                               tempAuthor = a;
                               break;
                           }
                       }
                       if(tempAuthor==null)
                       {
                            System.out.println("No matching author found!");
                       }
                       else
                       {
                           System.out.println("Your chosen Author Name is "+tempAuthor.getAuthorName());
                       }
                       book = new Book();
                       book.setBookId(bookId);
                       book.setBookTitle(bookTitle);
                       book.setDescription(description);
                       book.setPrice(price);
                       book.setAuthor(tempAuthor);
                       books[i] = book;
                    }
                    break;
                case 3:
                    System.out.println("Search a book by book name");
                    System.out.println("Enter the name of the book to search");
                    String bookName = sc.nextLine();
                    bookName=bookName.trim();
                    Book tempBook1 = null;//Should tempBook be declared outside switch case globally?
                    for(Book b: books)
                    {
                        if(b.getBookTitle().trim().equalsIgnoreCase(bookName.trim()))
                        {
                            tempBook1 = b;
                            break;
                        }
                    }
                    if(tempBook1==null)
                    {
                        System.out.println("No matching book found!");
                    }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Book ID:"+tempBook1.getBookId());
                        System.out.println("Book Name:"+tempBook1.getBookTitle());
                        System.out.println("Book Description:"+tempBook1.getDescription());
                        System.out.println("Book price:"+tempBook1.getPrice());
                        System.out.println("Book author:"+tempBook1.getAuthor().getAuthorId());
                        System.out.println("Book author:"+tempBook1.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Display a book details");
                    System.out.println("Enter the book id of the book");
                    int bookId = sc.nextInt();
                    Book tempBook = null;
                    for(Book b: books)
                    {
                        if(b.getBookId() == bookId)
                        {
                            tempBook = b;
                            break;
                        }
                    }
                    if(tempBook == null)
                        {
                            System.out.println("No matching book found!");
                        }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Book ID:"+tempBook.getBookId());
                        System.out.println("Book Name:"+tempBook.getBookTitle());
                        System.out.println("Book Description:"+tempBook.getDescription());
                        System.out.println("Book price:"+tempBook.getPrice());
                        System.out.println("Book author:"+tempBook.getAuthor().getAuthorId());
                        System.out.println("Book author:"+tempBook.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Display an author details");
                    System.out.println("Enter the author ID of the Author");
                    int authId = sc.nextInt();
                    Author tempAuthor = null;
                    for(Author a: authors)
                    {
                        if(a.getAuthorId()==authId)
                        {
                            tempAuthor = a;
                            break;
                        }
                    }
                    if(tempAuthor==null)
                    {
                        System.out.println("No matching Author found!");
                    }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Author ID : "+tempAuthor.getAuthorId());
                        System.out.println("Author Name is : "+tempAuthor.getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 6:
                    System.out.println("Display all books");
                    System.out.println("----------------------------------------------------");
                    for(Book b: books)
                    {
                        System.out.println("Book ID:"+b.getBookId());
                        System.out.println("Book Name:"+b.getBookTitle());
                        System.out.println("Book Description:"+b.getDescription());
                        System.out.println("Book price:"+b.getPrice());
                        System.out.println("Book author:"+b.getAuthor().getAuthorId());
                        System.out.println("Book author:"+b.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 7:
                    System.out.println("Display all authors");
                    System.out.println("----------------------------------------------------");
                    for(Author a : authors)
                    {
                        System.out.println("Author ID : "+a.getAuthorId());
                        System.out.println("Author Name is : "+a.getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    break;/*
                case 8:
                    System.out.println("Update an author");
                    System.out.println("Enter the name of the book to search");
                    String bookName = sc.nextLine();
                    break;
                case 9:
                    System.out.println("Delete an author");
                    System.out.println("Enter the name of the book to search");
                    String bookName = sc.nextLine();
                    break;*/
                case 10:
                    System.out.println("10: Update a book: Through choice");
                    System.out.println("Display all books");
                    System.out.println("----------------------------------------------------");
                    for(Book b: books)
                    {
                        System.out.println("Book ID:"+b.getBookId());
                        System.out.println("Book Name:"+b.getBookTitle());
                        System.out.println("Book Description:"+b.getDescription());
                        System.out.println("Book price:"+b.getPrice());
                        System.out.println("Book author:"+b.getAuthor().getAuthorId());
                        System.out.println("Book author:"+b.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    System.out.println("Enter the id of the book to update");
                    int bookId1 = sc.nextInt();//modify this
                    sc.nextLine();
                    Book tempBook2 = null;
                    int index=0;
                    for(int i=0; i<books.length; i++)
                    {
                        if(books[i].getBookId()==bookId1)
                        {
                            tempBook2 = books[i];
                            index=i;
                            break;
                        }
                    }
                    if(tempBook2==null)
                    {
                        System.out.println("No matching Book found!");
                    }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Book ID:"+tempBook2.getBookId());
                        System.out.println("Book Name:"+tempBook2.getBookTitle());
                        System.out.println("Book Description:"+tempBook2.getDescription());
                        System.out.println("Book price:"+tempBook2.getPrice());
                        System.out.println("Book author:"+tempBook2.getAuthor().getAuthorId());
                        System.out.println("Book author:"+tempBook2.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                        System.out.println("Please select an option to update Book Details from the below list");
                        System.out.println("a: Book ID");
                        System.out.println("b: Book Name");
                        System.out.println("c: Book Description");
                        System.out.println("d: Book Price");
                        System.out.println("e: Author");
                        String option = sc.nextLine();
                        switch(option.toLowerCase())
                        {
                            case "a":
                                System.out.println("Enter the New Book ID");
                                int bookId2 = sc.nextInt();
                                sc.nextLine();
                                books[index].setBookId(bookId2);
                                break;
                            case "b":
                                System.out.println("Enter the New Book Name");
                                String bookName2 = sc.nextLine();
                                books[index].setBookTitle(bookName2);
                                break;
                            case "c":
                                System.out.println("Enter the New Book Description");
                                String description2 = sc.nextLine();
                                books[index].setDescription(description2);
                                break;
                            case "d":
                                System.out.println("Enter the New Book Price");
                                double bookPrice2 = sc.nextDouble();
                                sc.nextLine();
                                books[index].setPrice(bookPrice2);
                                break;
                            case "e":
                                System.out.println("Available authors");
                                System.out.println("----------------------------------------------------");
                                for(Author a : authors)
                                {
                                    System.out.println("Author ID : "+a.getAuthorId());
                                    System.out.println("Author Name is : "+a.getAuthorName());
                                    System.out.println("----------------------------------------------------");
                                }
                                System.out.println("Enter the author Id of the author for this book");
                                int authId2 = sc.nextInt();
                                Author tempAuthor2 = new Author();
                                sc.nextLine();
                                for(Author a: authors)
                                {
                                    if(a.getAuthorId() == authId2)
                                    {
                                        tempAuthor2 = a;
                                        break;
                                    }
                                }
                                if(tempAuthor2==null)
                                {
                                    System.out.println("No matching author found!");
                                }
                                else
                                {
                                    System.out.println("Your chosen Author Name is "+tempAuthor2.getAuthorName());
                                    books[index].setAuthor(tempAuthor2);
                                }
                                break;
                            default:
                                System.out.println("You have selected an invalid option!!");
                        }
                    }
                    break;
                case 11:
                    System.out.println("11: Update a book: All Fields");
                    System.out.println("Display all books");
                    System.out.println("----------------------------------------------------");
                    for(Book b: books)
                    {
                        System.out.println("Book ID:"+b.getBookId());
                        System.out.println("Book Name:"+b.getBookTitle());
                        System.out.println("Book Description:"+b.getDescription());
                        System.out.println("Book price:"+b.getPrice());
                        System.out.println("Book author:"+b.getAuthor().getAuthorId());
                        System.out.println("Book author:"+b.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    System.out.println("Enter the id of the book to update");
                    int bookId4 = sc.nextInt();
                    sc.nextLine();
                    //sc=new Scanner(System.in);
                    Book tempBook4 = null;
                    int index4=0;
                    for(int i=0; i<books.length; i++)
                    {
                        if(books[i].getBookId()==bookId4)
                        {
                            tempBook4 = books[i];
                            index4=i;
                            break;
                        }
                    }
                    if(tempBook4==null)
                    {
                        System.out.println("No matching Book found!");
                    }
                    else
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Book ID:"+tempBook4.getBookId());
                        System.out.println("Book Name:"+tempBook4.getBookTitle());
                        System.out.println("Book Description:"+tempBook4.getDescription());
                        System.out.println("Book price:"+tempBook4.getPrice());
                        System.out.println("Book author:"+tempBook4.getAuthor().getAuthorId());
                        System.out.println("Book author:"+tempBook4.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                        System.out.println("Do you want to update the Book ID, enter Y to update or N to skip");
                        String option4 =sc.nextLine();
                        if(option4.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Enter the New Book ID");
                            int bookId5 = sc.nextInt();
                            sc.nextLine();
                            books[index4].setBookId(bookId5);
                        }
                        System.out.println("Do you want to update the Book Name, enter Y to update or N to skip");
                        option4 =sc.nextLine();
                        if(option4.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Enter the New Book Name");
                            String bookName5 = sc.nextLine();
                            books[index4].setBookTitle(bookName5);
                        }
                        System.out.println("Do you want to update the Book Description, enter Y to update or N to skip");
                        option4 =sc.nextLine();
                        if(option4.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Enter the New Book Description");
                            String description5 = sc.nextLine();
                            books[index4].setDescription(description5);
                        }
                        System.out.println("Do you want to update the Book Price, enter Y to update or N to skip");
                        option4 =sc.nextLine();
                        if(option4.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Enter the New Book Price");
                            double bookPrice5 = sc.nextDouble();
                            sc.nextLine();
                            books[index4].setPrice(bookPrice5);
                        }
                        System.out.println("Do you want to update the Author, enter Y to update or N to skip");
                        option4 =sc.nextLine();
                        if(option4.equalsIgnoreCase("Y"))
                        {
                            System.out.println("Available authors");
                            System.out.println("----------------------------------------------------");
                            for(Author a : authors)
                            {
                                System.out.println("Author ID : "+a.getAuthorId());
                                System.out.println("Author Name is : "+a.getAuthorName());
                                System.out.println("----------------------------------------------------");
                            }
                            System.out.println("Enter the author Id of the author for this book");
                            int authId5 = sc.nextInt();
                            Author tempAuthor5 = new Author();
                            sc.nextLine();
                            for(Author a: authors)
                            {
                                if(a.getAuthorId() == authId5)
                                {
                                    tempAuthor5 = a;
                                    break;
                                }
                            }
                            if(tempAuthor5==null)
                            {
                                System.out.println("No matching author found!");
                            }
                            else
                            {
                                System.out.println("Your chosen Author Name is "+tempAuthor5.getAuthorName());
                                books[index4].setAuthor(tempAuthor5);
                            }
                        }
                    }
                    break;
                case 12:
                    System.out.println("Delete a book");
                    System.out.println("Display all books");
                    System.out.println("----------------------------------------------------");
                    for(Book b: books)
                    {
                        System.out.println("Book ID:"+b.getBookId());
                        System.out.println("Book Name:"+b.getBookTitle());
                        System.out.println("Book Description:"+b.getDescription());
                        System.out.println("Book price:"+b.getPrice());
                        System.out.println("Book author:"+b.getAuthor().getAuthorId());
                        System.out.println("Book author:"+b.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                    }
                    System.out.println("Enter the id of the book to be deleted");
                    int bookId3 = sc.nextInt();
                    sc.nextLine();
                    Book tempBook3 = null;
                    for(Book b: books)
                    {
                        if(b.getBookId() == bookId3)
                        {
                            tempBook3 = b;
                            break;
                        }
                    }
                    if(tempBook3 == null)
                    {
                        System.out.println("No matching book found!");
                    }
                    else
                    {
                        System.out.println("Book id "+bookId3+" found");
                        System.out.println("----------------------------------------------------");
                        System.out.println("Book ID:"+tempBook3.getBookId());
                        System.out.println("Book Name:"+tempBook3.getBookTitle());
                        System.out.println("Book Description:"+tempBook3.getDescription());
                        System.out.println("Book price:"+tempBook3.getPrice());
                        System.out.println("Book author:"+tempBook3.getAuthor().getAuthorId());
                        System.out.println("Book author:"+tempBook3.getAuthor().getAuthorName());
                        System.out.println("----------------------------------------------------");
                        for(int i=0; i<books.length; i++)
                        {
                            if(books[i].getBookId() == bookId3)
                            {
                                for(int j=i; j<books.length-1; j++)
                                {
                                    books[j]=books[j+1];
                                }
                                break;
                            }
                        }
                        System.out.println("Display all books");
                        System.out.println("----------------------------------------------------");
                        for(Book b: books)
                        {
                            System.out.println("Book ID:"+b.getBookId());
                            System.out.println("Book Name:"+b.getBookTitle());
                            System.out.println("Book Description:"+b.getDescription());
                            System.out.println("Book price:"+b.getPrice());
                            System.out.println("Book author:"+b.getAuthor().getAuthorId());
                            System.out.println("Book author:"+b.getAuthor().getAuthorName());
                            System.out.println("----------------------------------------------------");
                        }
                        Book[] tempBooks = new Book[books.length-1];//shrink array
                        for(int i=0; i<tempBooks.length; i++)
                        {
                            tempBooks[i] = books[i];
                        }
                        System.out.println("Length of Books array :"+books.length);
                        //System.out.println("Shrinking the Books array");
                        //books = new Book[books.length-1];
                        books = tempBooks;
                        System.out.println("Length of Books array :"+books.length);
                        for(int i=0; i<tempBooks.length-1; i++)
                        {
                            books[i]=tempBooks[i];
                        }
                        System.out.println("Book id "+bookId3+" deleted");
                        System.out.println("Display all books");
                        System.out.println("----------------------------------------------------");
                        for(Book b: books)
                        {
                            System.out.println("Book ID:"+b.getBookId());
                            System.out.println("Book Name:"+b.getBookTitle());
                            System.out.println("Book Description:"+b.getDescription());
                            System.out.println("Book price:"+b.getPrice());
                            System.out.println("Book author:"+b.getAuthor().getAuthorId());
                            System.out.println("Book author:"+b.getAuthor().getAuthorName());
                            System.out.println("----------------------------------------------------");
                        }
                    }
                    break;
                case 99:
                    System.out.println("Exiting the Application");
                    System.exit(0);
                default:
                    System.out.println("Wrong Input! Please Try Again");
            }

        }
    }
}
