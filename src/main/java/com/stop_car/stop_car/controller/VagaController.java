package com.stop_car.stop_car.controller;

import com.stop_car.stop_car.controller.Dto.VagaDto.VagaDto;
import com.stop_car.stop_car.controller.Dto.VagaDto.VagaSaveDto;
import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import com.stop_car.stop_car.model.Vaga;
import com.stop_car.stop_car.service.VagaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "vaga")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class VagaController {

    private final VagaService vagaService;
    private final ModelMapper modelMapper;

    @PostMapping
    ResponseEntity<VagaSaveDto> criarVaga(@RequestBody VagaSaveDto vagaSaveDto) {
        vagaService.criarVaga(modelMapper.map(vagaSaveDto, Vaga.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/retorna-todas-vagas")
    public ResponseEntity<List<Vaga>> listarTodasVagas(
            @RequestParam(required = false) Long numero,
            @RequestParam(required = false) Boolean ocupada,
            @RequestParam(required = false) String tipoVaga,
            @RequestParam(required = false) String tipoVeiculo) {
        List<Vaga> vagas = vagaService.listarTodasVagas(numero, ocupada, tipoVaga, tipoVeiculo);
        return ResponseEntity.ok(vagas);
    }



}
