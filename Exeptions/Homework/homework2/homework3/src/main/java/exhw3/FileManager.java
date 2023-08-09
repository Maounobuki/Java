package exhw3;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileManager {/**
 * Прочитываем файл
 * @param filePath путь к файлу
 * @readFile метод возвращает содержимое файла
 * @throws IOException
 */
public String readFile(String filePath) throws IOException {
    File file = new File(filePath);
    if (!file.exists()) {
        throw new MissingFileException("Файл не найден");
    }

    StringBuilder content = new StringBuilder();

    try (FileReader reader = new FileReader(file)) {
        int character;
        while ((character = reader.read()) != -1) {
            content.append((char) character);
        }
    }

    return content.toString();
}

    /**
     *  Запись в файл
     * @param filePath путь к файлу
     * @param content содержимое
     * @writeFile метод записи в файл
     * @throws IOException
     */
    public void writeFile(String filePath, String content) throws IOException {
        File file = new File(filePath);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
    }

    /**
     * Копирование файла в директорию/файл
     * @param sourceFilePath путь к исходному файлу
     * @param destinationFilePath путь для нового расположения файла
     * @copyFile метод копирования файла в новое расположение
     * @throws IOException
     */
    public void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            throw new MissingFileException("Отсутствует исходный файл");
        }

        File destinationFile = new File(destinationFilePath);

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        }
    }
}
