package ru.idgroup.tsmanager.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "strategies")
@Data
public class TsStrategy {
    @Id
    private Long id;

    @Column
    private String shoreName;
    @Column
    private String fullName;
    @Column
    private String entranceDesc;
    @Column
    private String exitDesc;

    @Column(name = "state")
    @Enumerated(value = EnumType.ORDINAL)
    private StrategyStatus state = StrategyStatus.NEW;

}
