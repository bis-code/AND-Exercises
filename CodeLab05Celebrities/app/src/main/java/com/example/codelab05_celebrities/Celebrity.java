package com.example.codelab05_celebrities;

public class Celebrity {
    private String name;
    private char sex;
    private int photo;
    private String quote;

    public Celebrity(String name, char sex, int photo, String quote) {
        this.name = name;
        this.sex = sex;
        this.photo = photo;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
