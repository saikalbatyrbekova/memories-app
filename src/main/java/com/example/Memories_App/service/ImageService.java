package com.example.Memories_App.service;

import com.example.Memories_App.model.domain.Entry;
import com.example.Memories_App.model.domain.Image;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    Image save(MultipartFile image, Entry entry);
    void delete(String filename);
}
