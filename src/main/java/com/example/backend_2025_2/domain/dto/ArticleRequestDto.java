package com.example.backend_2025_2.domain.dto;

import com.example.backend_2025_2.domain.Article;

public record ArticleRequestDto (
        String title,
        String content
) {
    public static Article toEntity() {
        return new Article
    }
}