package com.stop_car.stop_car.controller;

import com.stop_car.stop_car.controller.Dto.VagaDto.VagaSaveDto;
import com.stop_car.stop_car.model.Vaga;
import com.stop_car.stop_car.service.VagaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "vaga")
@RequiredArgsConstructor
public class VagaController {

    private VagaService vagaService;
    private ModelMapper modelMapper;

    @PostMapping
    ResponseEntity<VagaSaveDto> criarVaga(@RequestBody VagaSaveDto vagaSaveDto) {
        vagaService.criarVaga(modelMapper.map(vagaSaveDto, Vaga.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
