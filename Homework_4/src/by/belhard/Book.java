package by.belhard;

import java.io.Serializable;

public class Book implements Serializable {
    String name;
    String authorName;
    String text;

    Book(){

    }
    Book(String name, String authorName, String text){
        this.name = name;
        this.authorName = authorName;
        this. text = text;


    }
}
