package ru.idgroup.tsmanager.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.idgroup.tsmanager.domain.TsStrategy;

public interface TsStrategyRepository extends PagingAndSortingRepository<TsStrategy, Long> {
}
