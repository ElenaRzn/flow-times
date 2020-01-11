package ru.sbt.javaschool.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbt.javaschool.data.SearchData;
import ru.sbt.javaschool.processor.PersonScanner;

import java.util.stream.Collectors;

@Service
public class SearchServiceImpl implements SearchService  {
    @Autowired
    private PersonScanner personScanner;

    public SearchData searchPersonByData(String data) {
        SearchData searchData = new SearchData();
        searchData.setPersonList(personScanner.getPersonList().stream().filter(person -> person.getSearchString().toUpperCase().contains(data.toUpperCase())).collect(Collectors.toList()));
        return searchData;
    }

    public SearchData searchPersonByName(String name, SearchData model) {
        SearchData searchData = new SearchData();
        searchData.setPersonList(model.getPersonList().stream().filter(person -> person.getName().toUpperCase().contains(name.toUpperCase())).collect(Collectors.toList()));
        return searchData;
    }

    public SearchData searchPersonBySurname(String surname, SearchData model) {
        SearchData searchData = new SearchData();
        searchData.setPersonList(model.getPersonList().stream().filter(person -> person.getSurname().toUpperCase().contains(surname.toUpperCase())).collect(Collectors.toList()));
        return searchData;
    }

    public SearchData searchPersonByPatronymic(String patronymic, SearchData model) {
        SearchData searchData = new SearchData();
        searchData.setPersonList(model.getPersonList().stream().filter(person -> person.getPatronymic().toUpperCase().contains(patronymic.toUpperCase())).collect(Collectors.toList()));
        return searchData;
    }
}