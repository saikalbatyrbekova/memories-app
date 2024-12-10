package com.example.Memories_App.controller;

import com.example.Memories_App.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/images")
public class ImageController {
    private final ImageService imageService;

    @DeleteMapping("/{imageName}")
    public void delete(@PathVariable String imageName) {
        imageService.delete(imageName);
    }
}
