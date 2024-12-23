package com.stop_car.stop_car.controller.Dto.VeiculoDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class VeiculoDto {
    private String placa;
    private String modelo;
    private String cor;
    private String marca;
    private String ano;
    private String categoria;
}
