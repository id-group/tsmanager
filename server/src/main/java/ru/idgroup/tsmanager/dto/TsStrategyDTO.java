package ru.idgroup.tsmanager.dto;

import lombok.Data;
import ru.idgroup.tsmanager.domain.StrategyStatus;

@Data
public class TsStrategyDTO {
    private Long id;
    private String shoreName;
    private String fullName;
    private String entranceDesc;
    private String exitDesc;
    private StrategyStatus state;
}
