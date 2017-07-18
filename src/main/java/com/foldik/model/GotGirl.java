package com.foldik.model;

import java.util.List;

public class GotGirl {

    private Integer id;
    private String name;
    private String chestSize;
    private int age;
    private List<Book> books;

    public GotGirl() {
    }

    public GotGirl(Integer id, String name, String chestSize, int age, List<Book> books) {
        this.id = id;
        this.name = name;
        this.chestSize = chestSize;
        this.age = age;
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "GotGirl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chestSize='" + chestSize + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
