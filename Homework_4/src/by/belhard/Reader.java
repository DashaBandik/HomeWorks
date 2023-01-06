package by.belhard;


import java.util.ArrayList;

public class Reader {
    String fullName;
    int numTicket;
    String faculty;
    String dateOfBirth;
    String telephoneNum;

    ArrayList<Book> books = new ArrayList<Book>();

    Reader() {

    }

    Reader(String fullName, int numTicket, String faculty, String dateOfBirth, String telefonNum) {
        this.fullName = fullName;
        this.numTicket = numTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNum = telefonNum;
    }


    void takeBook(Book book) {
        books.add(book);
        System.out.println(fullName + " взял книгу " + book.name);

    }

    void returnBook(String bookName) {
        boolean isBookReturned = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) != null && books.get(i).name.equals(bookName)) {
                books.remove(i);
                isBookReturned = true;
                System.out.println(fullName + " вернул книгу " + bookName);
                break;
            }
        }
        if (isBookReturned == false) {
            System.out.println(fullName + " не хранит книгу " + bookName);
        }

    }

    void printStatus() {
        int howManyBooks = 0;
        String bookNames = "";

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book != null) {
                howManyBooks++;
                    bookNames = bookNames + book.name;

                    bookNames = bookNames + ",";

            }
        }
        if (bookNames.length() > 0){
            bookNames = bookNames.substring(0, bookNames.length() - 1);
        }
        System.out.println(fullName + " взял " + howManyBooks + " книг(и): " + bookNames);

    }

}

