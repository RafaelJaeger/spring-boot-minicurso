package br.com.jaeger.spring_boot_essentials.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ExercicioDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String grupoMuscular;
}
