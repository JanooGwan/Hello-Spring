package com.example.backend_2025_2.domain.dto;

import java.time.LocalDateTime;

public record ArticleResponseDto (
        Long id,
        String title,
        String content,
        LocalDateTime createdDate,
        LocalDateTime modifiedDate
) {}