package com.stop_car.stop_car.controller.Dto.PrecoDto;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PrecoDto {
    private TipoVagaEnum tipoVaga;
    private BigDecimal precoHora;
    private BigDecimal precoDiaria;
    private Integer tempoMinimoParaDiaria;
}
