package com.github.cidarosa.ms.produto.dto;

import com.github.cidarosa.ms.produto.entities.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProdutoRequestDTO {

    private String nome;

    private String descricao;

    private Double valor;
    private Long categoriaId;

    public ProdutoRequestDTO(Produto produto) {
        nome = produto.getNome();
        descricao = produto.getDescricao();
        valor = produto.getValor();
        categoriaId = produto.getCategoria().getId();
    }
}
