package com.hoaxify.hoaxify.shared;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenericRsponse {

    private String message;

    public GenericRsponse(String message) {
        this.message = message;
    }
}
