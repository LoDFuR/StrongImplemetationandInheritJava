package org.example.FileWriteTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFileClass {
    //Task 3
    public static void main() throws IOException {
//              // Папка, в которой будет создан файл
        String baseDir = "D:\\NotGames";
        File[] Dirs = {new File(baseDir + "\\src"),
                new File(baseDir + "\\res"),
                new File(baseDir + "\\savegames"),
                new File(baseDir + "\\temp")
        };
        for (File dir : Dirs) {
            if (!dir.exists()) {
                dir.mkdirs(); // Создает все необходимые директории
                System.out.println("Директория " + dir.getAbsolutePath() + " успешно создана.");
            }
            // Имя файла и строка для записи
            String MainName = "main.txt", utilsName = "utils.txt";
            String mainText = "It's file Main.txt",
                    utilsText = "It's file Utils.txt";
            // Создание файла и запись в него
        File fileMain = new File(Dirs[0], MainName);
        try (FileWriter writer = new FileWriter(fileMain)) {
            writer.write(mainText);
            System.out.println("Файл " + MainName + " успешно создан.");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Не удалось создать файл " + MainName + ". Ошибка: " + e.getMessage());
        }
            File fileUtils = new File(Dirs[0], utilsName);
            try (FileWriter writer = new FileWriter(fileUtils)) {
                writer.write(utilsText);
                System.out.println("Файл " + utilsName + " успешно создан.");
                writer.flush();
            } catch (IOException e) {
                System.out.println("Не удалось создать файл " + utilsName + ". Ошибка: " + e.getMessage());
            }
        }
    }
}
