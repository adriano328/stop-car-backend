package com.stop_car.stop_car.service;

import com.stop_car.stop_car.model.Veiculo;
import com.stop_car.stop_car.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public Veiculo armazenarVeiculo(Veiculo veiculo) {
       return veiculoRepository.save(veiculo);
    }
}
