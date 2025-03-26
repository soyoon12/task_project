package com.example.task_project.dto;

import lombok.Getter;

@Getter
public class TodoRequestDto {
    private String title;
    private String contents;
    private String username;
    private String date;
    private Long password;
}