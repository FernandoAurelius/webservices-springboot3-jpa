package br.com.devsuperior.webservicesspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.webservicesspringboot3jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
