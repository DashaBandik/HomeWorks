package by.belhard;


public class Reader {
    String fullName;
    int numTicket;
    String faculty;
    String dateOfBirth;
    String telephoneNum;
    Book[] books = new Book[10];

    Reader() {

    }

    Reader(String fullName, int numTicket, String faculty, String dateOfBirth, String telefoneNum) {
        this.fullName = fullName;
        this.numTicket = numTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNum = telefoneNum;
    }


    void takeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println(fullName + " взял книгу " + book.name);
                break;
            }
        }
    }

    void returnBook(String bookName) {
        boolean isBookReturned = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].name.equals(bookName)) {
                books[i] = null;
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

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
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

