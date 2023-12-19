package com.example.demo.model;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class response<T> {
    private T data;
    private String error;
}
