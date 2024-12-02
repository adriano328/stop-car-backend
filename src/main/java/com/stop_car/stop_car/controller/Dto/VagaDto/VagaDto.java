package com.stop_car.stop_car.controller.Dto.VagaDto;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class VagaDto {
    private Long id;
    private Long numero;
    private Boolean ocupada;
    private TipoVagaEnum tipoVaga;
    private String tipoVeiculo;
    private BigDecimal precoHora;
    private BigDecimal precoDiaria;
    private Integer tempoMinimoParaDiaria;
}
