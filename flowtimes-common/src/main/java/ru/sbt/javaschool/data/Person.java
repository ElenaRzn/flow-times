package ru.sbt.javaschool.data;

import java.io.Serializable;

public class Person implements Serializable {
    private String surname;
    private String name;
    private String patronymic;
    private Integer age;
    private String city;
    private String sex;
    private String company;
    private String skills;
    private Long phone;
    private String mail;
    private String hobby;
    private boolean driverLicense;

    public Person() {

    }

    public Person(String surname, String name, String patronymic, Integer age, String city, String sex,
                  String company, String skills, Long phone, String mail, String hobby, boolean driverLicense) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.city = city;
        this.sex = sex;
        this.company = company;
        this.skills = skills;
        this.phone = phone;
        this.mail = mail;
        this.hobby = hobby;
        this.driverLicense = driverLicense;
    }

    public String getSearchString() {
        return String.join(", ", surname, name, patronymic, age.toString(), city, sex, company, skills, phone.toString(), mail, hobby);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getSex() {
        return sex;
    }

    public String getCompany() {
        return company;
    }

    public String getSkills() {
        return skills;
    }

    public Long getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getHobby() {
        return hobby;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }
}
