package org.example;

public class WiseSaying {
    private long id;
    private String author;
    private String content;
    WiseSaying(Long id, String c1, String c2) {
        this.id = id;
        this.author = c1;
        this.content = c2;
    }

    public long getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }
}
