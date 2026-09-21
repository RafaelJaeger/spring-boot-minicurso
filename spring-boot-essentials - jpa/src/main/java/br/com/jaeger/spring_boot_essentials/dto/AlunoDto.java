package br.com.jaeger.spring_boot_essentials.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String email ;
}
