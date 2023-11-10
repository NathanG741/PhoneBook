package com.zipcodewilmington.phonebook;

import java.util.*;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {


    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        this.phonebook.put(name, List.of(phoneNumber));

    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, List.of(phoneNumbers));

    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        assert phonebook != null;
        return phonebook.containsKey(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        assert phonebook != null;
        List<String> num = phonebook.get(name);
        return num.contains(phoneNumber);
    }


    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (String name : phonebook.keySet()) {
           if (phonebook.get(name).contains(phoneNumber)) {
               return name;
           }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(phonebook.keySet());
    }

    public Map<String, List<String>> getMap() {

        return this.phonebook;
    }
}

