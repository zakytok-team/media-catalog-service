package com.zakytok.mediacatalogservice.web;

import com.zakytok.mediacatalogservice.domain.ItemType;
import com.zakytok.mediacatalogservice.domain.ItemValid;

import java.util.Set;
import java.util.UUID;

public record ItemDto(
        UUID id,
        String title,
        String author,
        int year,
        ItemType type,
        ItemValid valid,
        Set<String> genres
) {
    public static ItemDto of(String title, String author, int year, ItemType type, Set<String> genres) {
        return new ItemDto(null, title, author, year, type, null, genres);
    }

    public static ItemDto of(String title, String author, int year, ItemType type, ItemValid valid, Set<String> genres) {
        return new ItemDto(null, title, author, year, type, valid, genres);
    }
}