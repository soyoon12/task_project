package com.example.task_project.entity;

import com.example.task_project.dto.TodoRequestDto;
import com.example.task_project.dto.TodoUpdateRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Todo {
    private Long id;
    private String username;
    private String title;
    private String contents;
    private Long password;
    private String date;

    public Todo(TodoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }

    public void update(TodoUpdateRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.username = requestDto.getUsername();
    }
}