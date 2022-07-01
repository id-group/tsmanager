package ru.idgroup.tsmanager.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.idgroup.tsmanager.domain.TsStrategy;
import ru.idgroup.tsmanager.repository.TsStrategyRepository;

import java.util.List;

@Service
public class TsStrategyService {
    private TsStrategyRepository tsStrategyRepository;

    public TsStrategyService(TsStrategyRepository tsStrategyRepository) {
        this.tsStrategyRepository = tsStrategyRepository;
    }

    public Page<TsStrategy> getStrategies(Pageable page) {
        return tsStrategyRepository.findAll(page);
    }
}
