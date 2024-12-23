package com.stop_car.stop_car.repository;

import com.stop_car.stop_car.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    @Query("SELECT COUNT(v) > 0 FROM Veiculo v WHERE v.placa = :placa")
    boolean existsByPlaca(String placa);

}
