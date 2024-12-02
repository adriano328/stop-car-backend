package com.stop_car.stop_car.service;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import com.stop_car.stop_car.model.Vaga;
import com.stop_car.stop_car.repository.VagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VagaService {

    private final VagaRepository vagaRepository;

    public Vaga criarVaga(Vaga vaga) {
       return vagaRepository.save(vaga);
    }

    public List<Vaga> listarTodasVagas(Long numero, Boolean ocupada, String tipoVaga, String tipoVeiculo) {
        return vagaRepository.findVagaByNumeroAndOcupadaAndTipoVagaAndTipoVeiculo(numero, ocupada, tipoVaga, tipoVeiculo);
    }

}
