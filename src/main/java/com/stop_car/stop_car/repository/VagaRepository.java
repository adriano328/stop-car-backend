package com.stop_car.stop_car.repository;

import com.stop_car.stop_car.model.Enum.TipoVagaEnum;
import com.stop_car.stop_car.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    @Query("SELECT v FROM Vaga v WHERE " +
            "(:numero IS NULL OR v.numero = :numero) AND " +
            "(:ocupada IS NULL OR v.ocupada = :ocupada) AND " +
            "(:tipoVaga IS NULL OR v.tipoVaga = :tipoVaga) AND " +
            "(:tipoVeiculo IS NULL OR v.tipoVeiculo = :tipoVeiculo)")
    List<Vaga> findVagaByNumeroAndOcupadaAndTipoVagaAndTipoVeiculo(@Param("numero") Long numero,
                                                                   @Param("ocupada") Boolean ocupada,
                                                                   @Param("tipoVaga") String tipoVaga,
                                                                   @Param("tipoVeiculo") String tipoVeiculo);

}
