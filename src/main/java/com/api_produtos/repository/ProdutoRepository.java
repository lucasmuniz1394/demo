package com.api_produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
