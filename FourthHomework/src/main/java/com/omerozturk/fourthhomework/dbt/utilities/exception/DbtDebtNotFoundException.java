package com.omerozturk.fourthhomework.dbt.utilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DbtDebtNotFoundException extends RuntimeException {

    public DbtDebtNotFoundException(String message) {
        super(message);
    }
}
