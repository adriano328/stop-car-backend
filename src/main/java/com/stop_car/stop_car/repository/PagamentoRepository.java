package com.stop_car.stop_car.repository;

import com.stop_car.stop_car.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
