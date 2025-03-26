package com.example.task_project.dto;

import lombok.Getter;

@Getter

public class TodoUpdateRequestDto {
    private String title;
    private String contents;
    private String username;
}