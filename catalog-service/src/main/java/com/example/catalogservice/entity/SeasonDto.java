package com.example.catalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeasonDto {
    private String id;
    private Integer seasonNumber;
    private List<ChapterDto> chapters;
}
