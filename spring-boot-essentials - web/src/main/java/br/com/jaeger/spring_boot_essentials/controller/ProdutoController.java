package br.com.jaeger.spring_boot_essentials.controller;

import br.com.jaeger.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.jaeger.spring_boot_essentials.dto.ProdutoDto;
import br.com.jaeger.spring_boot_essentials.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduct(@RequestBody ProdutoDto produto) {
        return produtoService.createProduct(produto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity updateProduct(@RequestBody ProdutoDto produto, @PathVariable Integer id) {
        return produtoService.updateProduct(produto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Integer id) {
        produtoService.deleteProduct(id);
    }
}
