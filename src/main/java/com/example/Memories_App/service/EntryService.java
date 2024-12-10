package com.example.Memories_App.service;

import com.example.Memories_App.model.dto.entry.EntryRequest;
import com.example.Memories_App.model.dto.entry.EntryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface EntryService {
    List<EntryResponse> all();
    EntryResponse addEntry(EntryRequest entryRequest, List<MultipartFile> images, String token);
    EntryResponse updateEntry(EntryRequest entryRequest, String token, Long id);
    EntryResponse getEntry(Long id);
    void deleteEntry(Long id, String token);
}
