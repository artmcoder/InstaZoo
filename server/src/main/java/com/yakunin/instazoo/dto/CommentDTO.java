package com.yakunin.instazoo.dto;

import javax.validation.constraints.NotEmpty;

public class CommentDTO {
    private Long id;
    private String username;
    @NotEmpty
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
