package com.example.backend_2025_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @GetMapping("/json")
    public AgeAndNameDto ageAndName() {
        return new AgeAndNameDto(24, "이관우");
    }
}
