package net.wattmarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="PRICES")
public class PricesEntity {

    @Id
    @Column(name="YEARMONTH")
    private Long yearMonth; // 형식: 202404,202403,202402...
    @Column(name = "주택용_고압_기타_200이하")
    private double hheUnder200;//house high etc
    @Column(name = "주택용_고압_기타_201~400") 
    private double hheBetween;
    @Column(name = "주택용_고압_기타_400초과")
    private double hheOver400;
    @Column(name = "주택용_고압_하계_300이하")
    private double hhsUnder300; // house high summer
    @Column(name = "주택용_고압_하계_301~450")
    private double hhsBetween;
    @Column(name = "주택용_고압_하계_450초과")
    private double hhsOver450;
    @Column(name = "주택용_저압_기타_200이하")
    private double hleUnder200;// house low etc
    @Column(name = "주택용_저압_기타_201~400")
    private double hleBetween;
    @Column(name = "주택용_저압_기타_400초과")
    private double hleOver400;
    @Column(name = "주택용_저압_하계_300이하")
    private double hlsUnder300; // house low summer
    @Column(name = "주택용_저압_하계_301~450")
    private double hlsBetween;
    @Column(name = "주택용_저압_하계_450초과")
    private double hlsOver450;

}