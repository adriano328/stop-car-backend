package com.stop_car.stop_car.model;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "preco")
@Data
public class Preco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipovaga")
    private TipoVagaEnum tipoVaga;

    @Column(name = "precohora")
    private BigDecimal precoHora;

    @Column(name = "precodiaria")
    private BigDecimal precoDiaria;

    @Column(name = "tempominimoparadiaria")
    private Integer tempoMinimoParaDiaria;

    @OneToMany(mappedBy = "preco")
    private Set<Vaga> vagas;
}
