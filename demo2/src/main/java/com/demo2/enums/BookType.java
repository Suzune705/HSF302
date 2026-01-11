package com.demo2.enums;


public enum BookType {
    ACTION("action"),
    ENGLISH("english"),
    ROMANCE("romance"),
    SKIll("skill"),
    TECHNOLOGY("technology");
    private final String type ;
    private BookType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
