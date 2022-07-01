package ru.idgroup.tsmanager.dto;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import ru.idgroup.tsmanager.domain.TsStrategy;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StrategyMapper {
    TsStrategyDTO toDTO(TsStrategy strategy);

    @IterableMapping(elementTargetType = TsStrategy.class)
    List<TsStrategyDTO> toDTOs(Collection<TsStrategy> strategies);
}
