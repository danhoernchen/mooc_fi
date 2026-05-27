
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amigo
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public void addBook(Book newBook){
        books.add(newBook);
    }
    
    public void printBooks(){
        for(Book currentBook: books){
            System.out.println(currentBook);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book currentBook: books){
            if(StringUtils.included(currentBook.title(), title)){
                result.add(currentBook);
            }
        }
        return result;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book currentBook: books){
            if(StringUtils.included(currentBook.publisher(), publisher)){
                result.add(currentBook);
            }
        }
        return result;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book currentBook: books){
            if(currentBook.year() == year){
                result.add(currentBook);
            }
        }
        return result;
    }
}
