package com.example.backend_2025_2.domain;

import java.time.LocalDateTime;

public class Article {

    private static Long articleCount = 0L;

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    public Article(String title, String content) {
        this.id = ++articleCount;
        this.title = title;
        this.content = content;
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = null;
    }
}
