package com.stop_car.stop_car.controller.Dto.VagaDto;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class VagaSaveDto {

    private String numero;
    private Boolean ocupada;
    private TipoVagaEnum tipoVaga;
    private BigDecimal precoHora;
    private BigDecimal precoDiaria;
    private Integer tempoMinimoParaDiaria;
}
