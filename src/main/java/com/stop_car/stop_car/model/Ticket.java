package com.stop_car.stop_car.model;

import com.stop_car.stop_car.model.Enum.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @OneToOne
    @JoinColumn(name = "vaga_id")
    private Vaga vaga;

    @Column(name = "datahoraentrada")
    private LocalDate dataHoraEntrada;

    @Column(name = "datahorasaida")
    private LocalDate dataHoraSaida;

    @Column(name = "valortotal")
    private BigDecimal valorTotal;

    @Column(name = "status")
    private StatusEnum status;

    @OneToOne(mappedBy = "ticket")
    private Pagamento pagamento;
}
