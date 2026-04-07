package com.workintech.s18d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlantErrorResponse {
    private int status;
    private String message;
}
