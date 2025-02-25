package com.example.spring_rest.repositories;

import com.example.spring_rest.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface BeerRepository extends JpaRepository<Beer, UUID> {
}