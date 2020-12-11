package com.hrdepartment.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    private Object data;
    private HttpStatus statusCode;
    private Boolean success;
    private String message;
}
