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
public class VagaController {

    private final VagaService vagaService;
    private final ModelMapper modelMapper;

    @PostMapping
    ResponseEntity<VagaSaveDto> criarVaga(@RequestBody VagaSaveDto vagaSaveDto) {
        vagaService.criarVaga(modelMapper.map(vagaSaveDto, Vaga.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/retorna-todas-vagas")
    public ResponseEntity<List<VagaDto>> retornaTodasAsVagas(
            @RequestParam(required = false) Long numero,
            @RequestParam(required = false) Boolean ocupada,
            @RequestParam(required = false) String tipoVaga) {

        List<Vaga> vagas = vagaService.listarTodasVagas(numero, ocupada, tipoVaga);
        List<VagaDto> vagaDtos = vagas.stream()
                .map(vaga -> modelMapper.map(vaga, VagaDto.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(vagaDtos);
    }



}
