package br.com.devsuperior.webservicesspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.webservicesspringboot3jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
