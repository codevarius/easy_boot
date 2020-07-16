package org.example.test.project.easy_boot.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class InputForm {
    @Size(min = 1, max = 10)
    @NotBlank
    private String data;
}
