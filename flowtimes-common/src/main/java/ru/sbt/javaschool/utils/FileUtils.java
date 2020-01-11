package ru.sbt.javaschool.utils;

import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileUtils {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FileUtils.class);
    public static final String DEFAULT_ENCODING = "UTF-8";
    public static final String ERROR_MOVE = "Ошибка перемещения файла задачи";
    public static final String ERROR_DELETE = "Ошибка удаления файла задачи";

    public static final String readFileToString(Path path) {
        String resultString = "";
        try {
            resultString = new String(Files.readAllBytes(path), DEFAULT_ENCODING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultString;
    }

    public static final String readFileToString(String path) {
        return readFileToString(Paths.get(path));
    }

    public static final void deleteFile(Path path) {
        try {
            Files.delete(path);
        } catch (IOException e) {
            log.error(ERROR_MOVE.concat(e.getLocalizedMessage()));
        }
    }

    public static final void deleteFile(String path) {
        deleteFile(Paths.get(path));
    }

    public static final void moveFile(Path from, Path to) {
        try {
            Files.move(from, to.resolve(from.getFileName()), REPLACE_EXISTING);
        } catch (IOException e) {
            log.error(ERROR_DELETE.concat(e.getLocalizedMessage()));
        }
    }
}