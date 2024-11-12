package com.stop_car.stop_car.controller;

import com.stop_car.stop_car.controller.Dto.PrecoDto.PrecoDto;
import com.stop_car.stop_car.model.Preco;
import com.stop_car.stop_car.service.PrecoService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "preco")
@RequiredArgsConstructor
public class PrecoController {

    private final PrecoService precoService;
    private final ModelMapper modelMapper;

    @PostMapping
    ResponseEntity<PrecoDto> salvarPreco (@RequestBody PrecoDto precoDto) {
        precoService.salvarPreco(modelMapper.map(precoDto, Preco.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
