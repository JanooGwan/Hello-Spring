package com.example.backend_2025_2.domain.dto;

import com.example.backend_2025_2.domain.Article;


public record ArticleCreateRequestDto(
        String title,
        String content
) {
    public Article toEntity() {
        return new Article(title, content);
    }
}