package com.api_produtos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_produtos.demo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
