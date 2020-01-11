package ru.sbt.javaschool.flows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.sbt.javaschool.data.SearchData;
import ru.sbt.javaschool.processor.PersonScanner;
import ru.sbt.javaschool.search.SearchService;

@Component
public class FlowTimesFlowActions {
    @Autowired
    private SearchService searchService;

    @Autowired
    private PersonScanner personScanner;

    public SearchData getDefaultData() throws Exception {
        SearchData searchData = new SearchData();
        searchData.setPersonList(personScanner.getPersonList());
        return searchData;
    }

    public SearchData searchByName(String name, SearchData model) throws Exception {
        SearchData person = searchService.searchPersonByName(name, model);
        if (person != null) {
            return person;
        } else {
            throw new Exception();
        }
    }

    public SearchData searchPersonByData(String surname) throws Exception {
        SearchData person = searchService.searchPersonByData(surname);
        if (person != null) {
            return person;
        } else {
            throw new Exception();
        }
    }

    public SearchData searchBySurname(String surname, SearchData model) throws Exception {
        SearchData person = searchService.searchPersonByName(surname, model);
        if (person != null) {
            return person;
        } else {
            throw new Exception();
        }
    }

    public SearchData searchByPatronymic(String patronymic, SearchData model) throws Exception {
        SearchData person = searchService.searchPersonByName(patronymic, model);
        if (person != null) {
            return person;
        } else {
            throw new Exception();
        }
    }
}