package com.stop_car.stop_car.repository;

import com.stop_car.stop_car.model.Preco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoRepository extends JpaRepository<Preco, Long> {
}
