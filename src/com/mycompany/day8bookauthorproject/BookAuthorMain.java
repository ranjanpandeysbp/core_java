package com.mycompany.day8bookauthorproject;

import java.util.Scanner;

public class BookAuthorMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int noOfBooks = 0;
        int noOfAuthors = 0;
        AuthorModel[] authorModelArray = null;//new Author[noOfBooks];// why do we need to initialise, throwing error as it is used in for loop authorArray.length in option 5
        Book[] bookArray = null;//new Book[noOfAuthors];// why do we need to initialise, throwing error as it is used in for loop bookArray.length in option 3
        AuthorModel authorModel = null;
        do
        {
            System.out.println("Please enter a value from the below list of available options:");
            System.out.println("0: Enter number of books and authors");
            System.out.println("1: Add authors");
            System.out.println("2: Add books");
            System.out.println("3: Search a book by book name");
            System.out.println("4: Display a book details");
            System.out.println("5: Display an author details");
            System.out.println("6: Display all books");
            System.out.println("7: Display all authors");
            System.out.println("99: Exit Program");
            choice = sc.nextInt();
            sc.nextLine();//To avoid issues caused when nextLine() was used in case 3
            switch(choice)
            {
                case 0:
                {
                    //0: Enter number of books and authors
                    System.out.println("Option selected is: "+choice);
                    System.out.println("Please provide the number of books and authors to be entered:");
                    System.out.println("Number of books?");
                    noOfBooks=sc.nextInt();
                    while(noOfBooks<=0)
                    {
                        System.out.println("Invalid no of Books");
                        System.out.println("Number of books?");
                        noOfBooks=sc.nextInt();
                    }
                    System.out.println("Number of authors?");
                    noOfAuthors=sc.nextInt();
                    while(noOfAuthors<=0)
                    {
                        System.out.println("Invalid no of Authors");
                        System.out.println("Number of authors?");
                        noOfAuthors=sc.nextInt();
                    }
                    System.out.println("Number of books entered is: "+noOfBooks);
                    System.out.println("Number of authors entered is: "+noOfAuthors);
                    System.out.println();
                }
                    break;
                case 1:
                {
                    //1: Add authors
                    System.out.println("Option selected is: "+choice);
                    if(noOfBooks==0 || noOfAuthors==0)//How to reduce the redundancy
                    {
                        System.out.println("Please select option 0 to enter number of books and authors first");
                    }
                    else
                    {
                        authorModelArray = new AuthorModel[noOfAuthors];//This can be moved as part of Case 0.
                        System.out.println("Enter the details of " + noOfAuthors + " author");
                        for (int i = 0; i < authorModelArray.length; i++) {
                            authorModelArray[i] = new AuthorModel();
                            System.out.println("Enter the Author ID of Author " + (i + 1));
                            authorModelArray[i].setAuthorId(sc.nextInt());
                            sc.nextLine();//To flush.. why not sc.next() and why it is required?
                            System.out.println("Enter the Author Name of Author " + (i + 1));
                            authorModelArray[i].setAuthorName(sc.nextLine());
                            //System.out.println("Author ID of Author "+(i+1)+" is: "+authorArray[i].getAuthorId());
                            //System.out.println("Author Name of Author "+(i+1)+" is: "+authorArray[i].getAuthorName());
                        }
                    }
                    System.out.println();
                }
                    break;
                case 2:
                {
                    //2: Add books
                    System.out.println("Option selected is: "+choice);
                    if(noOfBooks==0 || noOfAuthors==0)//How to reduce the redundancy
                    {
                        System.out.println("Please select option 0 to enter number of books and authors first");
                    }
                    else
                    {
                        bookArray = new Book[noOfBooks];//This can be moved as part of Case 0.
                        System.out.println("Enter the details of "+noOfBooks+" book");
                        for(int j=0;j<bookArray.length;j++)
                        {
                            bookArray[j] = new Book();
                            authorModel = new AuthorModel();

                            System.out.println("Enter the ID of Book "+(j+1));//Why it is underlined
                            bookArray[j].setBookId(sc.nextLong());
                            sc.nextLine();

                            System.out.println("Enter the Title of Book "+(j+1));
                            bookArray[j].setBookTitle(sc.nextLine());

                            System.out.println("Enter the Description of Book "+(j+1));
                            bookArray[j].setDescription(sc.nextLine());
                            System.out.println("Enter the Price of Book "+(j+1));
                            bookArray[j].setPrice(sc.nextDouble());
                            sc.nextLine();

                            /*Commented out as it was using auth object directly and setAuth() was not having any parameter
                            System.out.println("Enter the Author details of Book "+(j+1));
                            bookArray[j].setAuth();
                            System.out.println("Enter the Author ID of Book "+(j+1));
                            bookArray[j].auth.setAuthorId(sc.nextInt());//Is this correct, how to use setAuth and getAuth
                            sc.nextLine();
                            System.out.println("Enter the Author Name of Book "+(j+1));
                            bookArray[j].auth.setAuthorName(sc.nextLine());//Is this correct, how to use setAuth and getAuth
                            */
                            //
                            System.out.println("Enter the Author details of Book "+(j+1));
                            System.out.println("Enter the Author ID of Book "+(j+1));
                            int aId=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter the Author Name of Book "+(j+1));
                            String aName=sc.nextLine();
                            //bookArray[j].setAuth(aId,aName);
                            bookArray[j].setAuth(authorModel);
                        }
                    }
                    System.out.println();
                }
                    break;
                case 3:
                {
                    //3: Search a book by book name
                    System.out.println("Option selected is: "+choice);
                    //System.out.println("arrayOfBooks length is: "+bookArray.length);
                    int flag=0;
                    if (noOfBooks==0)//if user selects option 3 before selecting option 0
                    {
                        System.out.println("Please select option 0 to enter number of books and authors first");
                    }
                    else if(bookArray.length==0)//if user selects option 3 before selecting option 2
                    {
                        System.out.println("Please select option 2 to enter book details first");
                    }
                    else
                    {
                        System.out.println("Enter the book name or part of book name to search: ");
                        String bookSearch = sc.nextLine();
                        System.out.println("Search keyword entered is: "+bookSearch);
                        /*for(int j=0;j<bookArray.length;j++)
                        {
                            //System.out.println(bookArray[j].getBookTitle());
                            if(bookArray[j].getBookTitle().toLowerCase().contains(bookSearch.toLowerCase()))
                            {
                                flag++;
                                System.out.println("Book Name "+flag+" matched is: "+bookArray[j].getBookTitle());
                            }
                        }*/
                        for(Book book:bookArray)//practicing enhanced for loop
                        {
                         if(book.getBookTitle().toLowerCase().contains(bookSearch.toLowerCase()))
                         {
                             flag++;
                             System.out.println("Book Name "+flag+" matched is: "+book.getBookTitle());
                         }
                        }
                        if(flag==0)
                        {
                            System.out.println("Match was not found!! Try searching again by selecting option 3");
                        }
                    }
                    System.out.println();
                }
                    break;
                case 4:
                {
                    //4: Display a book details
                    System.out.println("Option selected is: "+choice);
                    if (noOfBooks==0)//if user selects option 4 before selecting option 0
                    {
                        System.out.println("Please select option 0 to enter number of books and authors first");
                    }
                    else if(bookArray.length==0)//if user selects option 4 before selecting option 2
                    {
                        System.out.println("Please select option 2 to enter book details first");
                    }
                    else
                        {
                            System.out.println("Displaying Book Details of 1st Book: ");
                            System.out.println("ID of Book: "+bookArray[0].getBookId());
                            System.out.println("Title of Book: "+bookArray[0].getBookTitle());
                            System.out.println("Description of Book: "+bookArray[0].getDescription());
                            System.out.println("Price of Book: "+bookArray[0].getPrice());
                            System.out.println("Author ID of Author: "+bookArray[0].getAuth().getAuthorId());
                            System.out.println("Author Name of Author: "+bookArray[0].getAuth().getAuthorName());
                        }
                    System.out.println();
                }
                    break;
                case 5:
                {
                    //5: Display an author details
                    System.out.println("Option selected is: "+choice);
                    if (noOfAuthors==0)//if user selects option 5 before selecting option 0
                    {
                        System.out.println("Please select option 0 to enter number of books and authors first");
                    }
                    else if(authorModelArray.length==0)//if user selects option 5 before selecting option 1
                    {
                        System.out.println("Please select option 1 to enter author details first");
                    }
                    else
                    {
                        System.out.println("Displaying Author Details of 1st Author: ");
                        System.out.println("ID of Author: "+ authorModelArray[0].getAuthorId());
                        System.out.println("Name of Author: "+ authorModelArray[0].getAuthorName());
                    }
                    System.out.println();
                }
                    break;
                case 6:
                {
                    //6: Display all books
                    System.out.println("Option selected is: "+choice);
                    if (noOfBooks==0)//if user selects option 6 before selecting option 0
                    {
                        System.out.println("Please select option 0 to enter number of books and authors first");
                    }
                    else if(bookArray.length==0)//if user selects option 6 before selecting option 2
                    {
                        System.out.println("Please select option 2 to enter book details first");
                    }
                    else
                    {
                        System.out.println("Displaying Book Details of "+(bookArray.length)+" Books available:");
                        for(int j=0; j< bookArray.length;j++)
                        {
                            System.out.println("ID of Book "+(j+1)+" is: "+bookArray[j].getBookId());
                            System.out.println("Title of Book "+(j+1)+" is: "+bookArray[j].getBookTitle());
                            System.out.println("Description of Book "+(j+1)+" is: "+bookArray[j].getDescription());
                            System.out.println("Price of Book "+(j+1)+" is: "+bookArray[j].getPrice());
                            System.out.println("Author ID of Author "+(j+1)+" is: "+bookArray[j].getAuth().getAuthorId());
                            System.out.println("Author Name of Author "+(j+1)+" is: "+bookArray[j].getAuth().getAuthorName());
                        }
                    }
                    System.out.println();
                }
                    break;
                case 7:
                {
                    //7: Display all authors
                    System.out.println("Option selected is: "+choice);
                    if (noOfAuthors==0)//if user selects option 7 before selecting option 0
                    {
                        System.out.println("Please select option 0 to enter number of books and authors first");
                    }
                    else if(authorModelArray.length==0)//if user selects option 7 before selecting option 1
                    {
                        System.out.println("Please select option 1 to enter author details first");
                    }
                    else
                    {
                        System.out.println("Displaying Author Details of "+(authorModelArray.length)+" Authors available:");
                        for(int i = 0; i< authorModelArray.length; i++)
                        {
                            System.out.println("ID of Author "+(i+1)+" is: "+ authorModelArray[i].getAuthorId());
                            System.out.println("Name of Author "+(i+1)+" is: "+ authorModelArray[i].getAuthorName());
                        }
                    }
                    System.out.println();
                }
                    break;
                case 99:
                {
                    //99: Exit Program
                    System.out.println("Option selected is: "+choice);
                    System.out.println("Program will be terminated");
                }
                    break;
                default:
                    System.out.println("You have selected an invalid option!! Please Try again");
                    System.out.println();
            }
        }while(choice!=99);
    }
}
