package com.example.backend_2025_2.repository;

import com.example.backend_2025_2.domain.Article;
import com.example.backend_2025_2.domain.dto.ArticleCreateRequestDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArticleRepository {

    List<Article> articles = new ArrayList<>();

    public Optional<Article> findById(Long id) {
        return articles.stream()
                .filter(article -> article.getId().equals(id))
                .findFirst();
    }

    public Article save(ArticleCreateRequestDto articleRequestDto) {
        Article article = articleRequestDto.toEntity();
        articles.add(article);
        return article;
    }

    public Article update(Article)
}
