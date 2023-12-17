package br.com.devsuperior.webservicesspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.webservicesspringboot3jpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}