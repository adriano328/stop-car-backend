package com.stop_car.stop_car.model;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import jakarta.persistence.*;
import lombok.Data;

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

    @OneToOne(mappedBy = "vaga")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "preco_id")
    private Preco preco;
}
