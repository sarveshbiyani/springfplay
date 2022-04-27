package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.CartProduct;

public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {

}
