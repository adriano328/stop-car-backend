package com.stop_car.stop_car.controller;

import com.stop_car.stop_car.controller.Dto.VeiculoDto.VeiculoDto;
import com.stop_car.stop_car.model.Veiculo;
import com.stop_car.stop_car.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "veiculo")
@RequiredArgsConstructor
public class VeiculoController {

    private final VeiculoRepository veiculoRepository;
    private final ModelMapper modelMapper;

    @PostMapping
    ResponseEntity<VeiculoDto> armazenarVeiculo(@RequestBody VeiculoDto veiculoDto) {
        veiculoRepository.save(modelMapper.map(veiculoDto, Veiculo.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
