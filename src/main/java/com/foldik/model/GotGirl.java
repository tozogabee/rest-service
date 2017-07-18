package com.foldik.model;

import java.util.List;

public class GotGirl {

    private String name;
    private String chestSize;
    private int age;
    private List<Book> books;

    public GotGirl(String name, String chestSize, int age, List<Book> books) {
        this.name = name;
        this.chestSize = chestSize;
        this.age = age;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChestSize() {
        return chestSize;
    }

    public void setChestSize(String chestSize) {
        this.chestSize = chestSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
