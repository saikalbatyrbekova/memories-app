package com.example.Memories_App.controller;

import com.example.Memories_App.model.dto.entry.EntryRequest;
import com.example.Memories_App.model.dto.entry.EntryResponse;
import com.example.Memories_App.service.EntryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/entries")
public class EntryController {
    private final EntryService entryService;

    @GetMapping
    public List<EntryResponse> all() {
        return entryService.all();
    }

    @PostMapping
    public EntryResponse addEntry(
            @RequestPart EntryRequest entryRequest,
            @RequestPart List<MultipartFile> images,
            @RequestHeader("Authorization") String token
    ) {
        return entryService.addEntry(entryRequest, images, token);
    }

    @PutMapping("/{id}")
    public EntryResponse updateEntry(
            @RequestBody EntryRequest entryRequest,
            @RequestHeader("Authorization") String token,
            @PathVariable Long id
    ) {
        return entryService.updateEntry(entryRequest, token, id);
    }

    @GetMapping("/{id}")
    public EntryResponse getEntry(@PathVariable Long id) {
        return entryService.getEntry(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable Long id, @RequestHeader("Authorization") String token) {
        entryService.deleteEntry(id, token);
    }
}
