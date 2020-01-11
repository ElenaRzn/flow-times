package ru.sbt.javaschool.search;

import org.springframework.stereotype.Service;
import ru.sbt.javaschool.data.SearchData;

@Service
public interface SearchService {
    SearchData searchPersonByData(String data);

    SearchData searchPersonByName(String name, SearchData model);

    SearchData searchPersonBySurname(String surname, SearchData model);

    SearchData searchPersonByPatronymic(String patronymic, SearchData model);
}
