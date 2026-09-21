package br.com.jaeger.spring_boot_essentials.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class TreinoDto {

    @NotBlank
    private Integer alunoId;
    @NotBlank
    private String nome;
    @NotEmpty
    private List<Integer> exerciciosIds;
}
