package com.stop_car.stop_car.service;

import com.stop_car.stop_car.model.Preco;
import com.stop_car.stop_car.repository.PrecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrecoService {

    private final PrecoRepository precoRepository;

    public Preco salvarPreco(Preco preco) {
       return precoRepository.save(preco);
    }

}
