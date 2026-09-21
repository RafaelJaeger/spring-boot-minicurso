package br.com.jaeger.spring_boot_essentials.controller;

import br.com.jaeger.spring_boot_essentials.database.model.AvaliacoesFisicasEntity;
import br.com.jaeger.spring_boot_essentials.dto.AlunoDto;
import br.com.jaeger.spring_boot_essentials.exception.BadRequestException;
import br.com.jaeger.spring_boot_essentials.exception.NotFoundException;
import br.com.jaeger.spring_boot_essentials.service.AlunoService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/alunos")
@RequiredArgsConstructor
@Validated
public class AlunosController {

    private final AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAluno(@RequestBody @Valid AlunoDto alunoDto) throws BadRequestException {
        alunoService.criarAluno(alunoDto);
    }

    @GetMapping("/{alunoId}/avaliacao")
    @ResponseStatus(HttpStatus.OK)
    public AvaliacoesFisicasEntity getAlunoAvaliacao(@PathVariable Integer alunoId) throws NotFoundException {
        return alunoService.getAlunoAvaliacao(alunoId);
    }
}


