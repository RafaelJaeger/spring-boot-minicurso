package br.com.jaeger.spring_boot_essentials.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {
    public String message;
    public Integer status;
}
