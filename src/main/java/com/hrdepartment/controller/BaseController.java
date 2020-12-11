package com.hrdepartment.controller;

import com.hrdepartment.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class BaseController {
    public BaseResponse responseSuccess(Object data) {
        return BaseResponse
                .builder()
                .success(true)
                .data(data)
                .statusCode(HttpStatus.OK)
                .build();
    }

    public BaseResponse responseError(Object data, String message, HttpStatus httpCode) {
        return BaseResponse
                .builder()
                .success(false)
                .data(data)
                .statusCode(httpCode)
                .message(message)
                .build();
    }
}
