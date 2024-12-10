package com.example.Memories_App.mapper;

import com.example.Memories_App.model.domain.Entry;
import com.example.Memories_App.model.dto.entry.EntryRequest;
import com.example.Memories_App.model.dto.entry.EntryResponse;

import java.util.List;

public interface EntryMapper {
    Entry toEntry(EntryRequest request, Entry entry);
    EntryResponse toResponse(Entry entry);
    List<EntryResponse> toResponseList(List<Entry> entries);
}
