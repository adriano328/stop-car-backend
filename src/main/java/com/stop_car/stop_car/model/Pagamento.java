package com.stop_car.stop_car.model;

import com.stop_car.stop_car.model.Enum.FormaPagamentoEnum;
import com.stop_car.stop_car.model.Enum.StatusPagamento;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "pagamento")
@Data
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Vaga vaga;

    @Column(name = "formapagamento")
    private FormaPagamentoEnum formaPagamentoEnum;

    @Column(name = "datahorapagamento")
    private LocalDate dataHoraPagamento;

    @Column(name = "status")
    private StatusPagamento statusPagamento;
}
