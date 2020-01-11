package ru.sbt.javaschool.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchData implements Serializable {
    private List<Person> personList = new ArrayList<>();
    private String searchString;

    public SearchData() {

    }

    public SearchData(List<Person> personList, String searchString) {
        this.personList = personList;
        this.searchString = searchString;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}