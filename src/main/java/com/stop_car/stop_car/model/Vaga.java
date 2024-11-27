package com.stop_car.stop_car.model;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "vaga")
@Data
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "ocupada")
    private Boolean ocupada;

    @Column(name = "tipovaga")
    private TipoVagaEnum tipoVaga;

    @Column(name = "precohora")
    private BigDecimal precoHora;

    @Column(name = "precodiaria")
    private BigDecimal precoDiaria;

    @Column(name = "tempominimoparadiaria")
    private Integer tempoMinimoParaDiaria;
}
