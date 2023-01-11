package by.belhard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class FileUtil {

    public static boolean saveReadersList(LinkedList<Reader> readers) {
        try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Dasha\\IdeaProjects\\homeworks\\Homework_4\\Reader.txt"))) {
            file.writeObject(readers);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static LinkedList<Reader> restoreReadersList() {
        try (ObjectInputStream file = new ObjectInputStream(new FileInputStream("C:\\Users\\Dasha\\IdeaProjects\\homeworks\\Homework_4\\Reader.txt"))) {
            LinkedList<Reader> readers = (LinkedList<Reader>) file.readObject();
            if (readers != null) {
                return readers;
            }

        } catch (Exception ex) {
            System.out.println("Не удалось прочесть файл");
        }
        return new LinkedList<Reader>();
    }
}