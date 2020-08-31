package ru.ann.kont.file.hosting.dto;

import ru.ann.kont.file.hosting.errors.Error;

import lombok.Data;

@Data
public class ErrorResponseDto {
    private final int code;
    private final String description;

    public static ErrorResponseDto of(Error error) {
        return new ErrorResponseDto(error.getCode(), error.getDescription());
    }
}
