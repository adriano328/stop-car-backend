package com.stop_car.stop_car.controller;

import com.stop_car.stop_car.controller.Dto.VeiculoDto.VeiculoDto;
import com.stop_car.stop_car.exception.VeiculoJaCadastradoException;
import com.stop_car.stop_car.model.Veiculo;
import com.stop_car.stop_car.repository.VeiculoRepository;
import com.stop_car.stop_car.service.VeiculoService;
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

    private final VeiculoService veiculoService;
    private final ModelMapper modelMapper;

    @PostMapping
    ResponseEntity<?> armazenarVeiculo(@RequestBody VeiculoDto veiculoDto) {
            veiculoService.armazenarVeiculo(modelMapper.map(veiculoDto, Veiculo.class));
            return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
