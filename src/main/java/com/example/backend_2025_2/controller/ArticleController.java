package com.example.backend_2025_2.controller;

import com.example.backend_2025_2.domain.dto.ArticleCreateRequestDto;
import com.example.backend_2025_2.domain.dto.ArticleResponseDto;
import com.example.backend_2025_2.domain.dto.ArticleUpdateRequestDto;
import com.example.backend_2025_2.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService = new ArticleService();

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ArticleResponseDto>> getArticle(@PathVariable("id") Long id) {
        Optional<ArticleResponseDto> response = articleService.getArticleById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<ArticleResponseDto> createArticle(@RequestBody ArticleCreateRequestDto articleCreateRequestDto) {
        ArticleResponseDto response = articleService.createArticle(articleCreateRequestDto);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<ArticleResponseDto>> updateArticle(@PathVariable Long id, @RequestBody ArticleUpdateRequestDto articleUpdateRequestDto) {
        Optional<ArticleResponseDto> response = articleService.updateArticle(id, articleUpdateRequestDto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticleById(@PathVariable Long id) {
        articleService.deleteArticle(id);

        return ResponseEntity.noContent().build();
    }
}
