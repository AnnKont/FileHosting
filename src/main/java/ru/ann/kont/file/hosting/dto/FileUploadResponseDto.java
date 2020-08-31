package ru.ann.kont.file.hosting.dto;

import ru.ann.kont.file.hosting.errors.Error;

import lombok.Data;

@Data
public class FileUploadResponseDto {

    private final String fileName;
    private final ErrorResponseDto error;

    public static FileUploadResponseDto of(String fileName, Error error) {
        return new FileUploadResponseDto(fileName, ErrorResponseDto.of(error));
    }

    public static FileUploadResponseDto of(String fileName) {
        return new FileUploadResponseDto(fileName, null);
    }
}
