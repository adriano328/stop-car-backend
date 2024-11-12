package com.stop_car.stop_car.service;

import com.stop_car.stop_car.repository.VagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VagaService {

    private final VagaRepository vagaRepository;

}
