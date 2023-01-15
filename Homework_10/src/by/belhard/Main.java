package by.belhard;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File dir = new File("C:\\Users\\Dasha\\IdeaProjects\\homeworks\\Homework_10\\src\\by\\belhard\\catalog");
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(dir, "result.txt")));

            if (dir.exists()) {
                for (File file : dir.listFiles()) {
                    try (BufferedReader read = new BufferedReader(new FileReader(file))) {
                        String string;
                        while ((string = read.readLine()) != null) {
                            writer.write(string + "\n");
                        }

                } catch(Exception ex){
                    System.out.println("Файлы в каталоге не удалось прочесть");

                }

            }
        }
            writer.close();
    }
}