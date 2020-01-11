package ru.sbt.javaschool.processor;

import org.springframework.stereotype.Component;
import ru.sbt.javaschool.data.Person;
import ru.sbt.javaschool.utils.FileUtils;
import ru.sbt.javaschool.utils.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonScanner {
    public static final String CURRENT_FOLDER = ".";

    public static final String FILE_EXTENSION = ".json";

    private List<Person> personList = new ArrayList<>();

    //@Scheduled(fixedRate = 1000)
    public void scan() {
        File folder = new File(getClass().getClassLoader().getResource(CURRENT_FOLDER).getPath());
        if(folder.listFiles() != null) {
            for (int i = 0; i < folder.listFiles().length; i++) {
                String filePath = folder.listFiles()[i].getAbsolutePath();
                if (filePath.endsWith(FILE_EXTENSION)) {
                    personList.add(StringUtils.getObjectFromFile(folder.listFiles()[i], Person.class));
                    FileUtils.deleteFile(filePath);
                }
            }
        }
    }

    public List<Person> getPersonList() {
        scan();
        return personList;
    }
}
