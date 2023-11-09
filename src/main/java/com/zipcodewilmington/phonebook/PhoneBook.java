package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
    private String name;
    private String phoneNumber;
    private List<String> phoneNumbers;


    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = null;
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public void addAll(String name, String... phoneNumbers) {
        this.name = name;
        this.phoneNumbers = List.of(phoneNumbers);
    }



    public void remove(String name) {
        this.name = name;

    }

    public Boolean hasEntry(String name) {

        return null;
    }

    public List<String> lookup(String name) {

        return null;
    }

    public String reverseLookup(String phoneNumber)  {

        return this.phoneNumber;
    }

    public List<String> getAllContactNames() {

        return null;
    }

    public Map<String, List<String>> getMap() {

        return null;
    }

    /*
    ========================================================
    ========================================================
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

