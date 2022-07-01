package ru.idgroup.tsmanager.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.idgroup.tsmanager.dto.StrategyMapper;
import ru.idgroup.tsmanager.dto.TsStrategyDTO;
import ru.idgroup.tsmanager.service.TsStrategyService;

import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/strategies")
public class StrategyController {
    private StrategyMapper strategyMapper;
    private TsStrategyService tsStrategyService;

    public StrategyController(StrategyMapper strategyMapper, TsStrategyService tsStrategyService) {
        this.strategyMapper = strategyMapper;
        this.tsStrategyService = tsStrategyService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<TsStrategyDTO> getStrategies(Pageable page) {
        var strategies = tsStrategyService.getStrategies(page).stream().toList();
        return new PageImpl<>( strategyMapper.toDTOs(strategies), page, strategies.size());
    }

}
