package ru.sbt.javaschool.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class StringUtils {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FileUtils.class);

    public static final String ERROR_PARSING_STRING = "Ошибка парсинга JSON строки \"%s\" в объект. ";

    public static final String ERROR_CREATING_STRING = "Ошибка создания JSON строки из объекта: ";

    private static final ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static final <T> T getObjectFromJson(String json, Class<T> cls) {
        T object = null;
        try {
            object = mapper.readValue(json, cls);
        } catch (IOException e) {
            log.error(ERROR_PARSING_STRING.concat(e.getLocalizedMessage()), json);
        }
        return object;
    }

    public static final <T> T getObjectFromFile(File file, Class<T> cls) {
        return getObjectFromJson(FileUtils.readFileToString(file.getAbsolutePath()), cls);
    }

    public static final <T> T getObjectFromPath(Path path, Class<T> cls) {
        return getObjectFromJson(FileUtils.readFileToString(path), cls);
    }

    public static final String createJsonFromObject(Object object) {
        String json = "";
        try {
            json = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error(ERROR_CREATING_STRING.concat(e.getLocalizedMessage()));
        }
        return json;
    }
}