package by.belhard;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int action;
        LinkedList<Reader> readers = FileUtil.restoreReadersList();

        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статусы всех читателей");
            System.out.println("6 -- выйти их программы");
            System.out.println("Введите номер действия: ");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: {

                    System.out.println("Заполните данные о читателе...");
                    Reader reader = new Reader();
                    System.out.print("Введите ФИО: ");
                    reader.fullName = scanner.nextLine();
                    System.out.print("Введите номер читательского билета: ");
                    reader.numTicket = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите факультет: ");
                    reader.faculty = scanner.nextLine();
                    System.out.print("Введите дату рождения: ");
                    reader.dateOfBirth = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    reader.telephoneNum = scanner.nextLine();
                    readers.add(reader);
                    break;
                }
                case 2: {
                    System.out.println("Введите данные книги...");
                    Book book = new Book();
                    System.out.print("Введите название книги: ");
                    book.name = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    book.authorName = scanner.nextLine();
                    System.out.print("Введите содержание книги: ");
                    book.text = scanner.nextLine();

                    System.out.print("Введите номер читательского билета: ");

                    int number = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).numTicket == number) {
                            readers.get(i).takeBook(book);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Введите название книги: ");
                    String bookName = scanner.nextLine();

                    System.out.print("Введите номер читательского билета: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i) != null && readers.get(i).numTicket == number) {
                            readers.get(i).returnBook(bookName);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Введите номер читательского билета: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i) != null && readers.get(i).numTicket == number) {
                            readers.get(i).printStatus();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader r : readers) {
                        if (r != null) {
                            r.printStatus();
                        }
                    }
                    break;
                }

                case 6: {
                    System.out.println("Завершаем программу");
                    FileUtil.saveReadersList(readers);
                    break;
                }

                default: {
                    System.out.println(" Нет такой команды");
                }
            }
        } while (action != 6);

    }
}
