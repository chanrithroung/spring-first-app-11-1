package com.firstapp.firstapp.apiResponse;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ApiResponse<T> {
    private String message;
    private int status;
    private T date;
}
